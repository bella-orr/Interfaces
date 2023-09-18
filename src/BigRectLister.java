import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        //declarations
        ArrayList <Rectangle> rectangles = new ArrayList<>();


        //set test examples for the array list with perimeter > 10
        Rectangle recOne = new Rectangle(5,2); //p=14
        Rectangle recTwo = new Rectangle(10,5); //p=30
        Rectangle recThree = new Rectangle(7,2); //p=18
        Rectangle recFour = new Rectangle(9,9); //p=36
        Rectangle recFive = new Rectangle(10,10); // p=40

        //set test examples for array list with perimeter <= 10
        Rectangle recSix = new Rectangle(3,1); //p=8
        Rectangle recSeven = new Rectangle(2,2); //p=8
        Rectangle recEight = new Rectangle(1,2); //p=6
        Rectangle recNine = new Rectangle(3,2); //p=10
        Rectangle recTen = new Rectangle(1,1); //p=4

        //add all examples to the arraylist
        rectangles.add(recOne);
        rectangles.add(recTwo);
        rectangles.add(recThree);
        rectangles.add(recFour);
        rectangles.add(recFive);
        rectangles.add(recSix);
        rectangles.add(recSeven);
        rectangles.add(recEight);
        rectangles.add(recNine);
        rectangles.add(recTen);

        //outputs the array list of Rectangle Objects
        for (Rectangle r: rectangles)
        {
            System.out.println(r);
        }

        //goes to check of perimeter is greater than 10



    }
}
