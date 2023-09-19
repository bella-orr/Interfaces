import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister
{

    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String lines;


        try
        {

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));


                while(reader.ready())
                {//reads each line of the text file
                   lines = reader.readLine();

                   System.out.println("This is the text file before ShortWordFilter is applied");
                   System.out.println(lines);

                    //splits each word into an array at the space
                    String [] words = lines.split(" ");

                    //calls ShortWordFilter
                    ShortWordFilter shortWordFilter = new ShortWordFilter();

                    System.out.println();
                    System.out.println("Strings < 5"); //header

                    for ( int i =0 ; i< words.length ;i++ )
                    {
                       if( shortWordFilter.accept(words[i]) == true )
                       {
                           System.out.print(words[i] + ", ");
                       }

                    }


                }
                reader.close(); // must close the file to seal it and flush buffer
                System.out.println("\n\nData file read!");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}