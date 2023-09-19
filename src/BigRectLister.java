import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        //declarations
        ArrayList <BigRectFilter> rectangles = new ArrayList<>();


        //set test examples for the array list with perimeter > 10
        BigRectFilter recOne = new BigRectFilter(5,2); //p=14
        BigRectFilter recTwo = new BigRectFilter(10,5); //p=30
        BigRectFilter recThree = new BigRectFilter(7,2); //p=18
        BigRectFilter recFour = new BigRectFilter(9,9); //p=36
        BigRectFilter recFive = new BigRectFilter(10,10); // p=40

        //set test examples for array list with perimeter <= 10
        BigRectFilter recSix = new BigRectFilter(3,1); //p=8
        BigRectFilter recSeven = new BigRectFilter(2,2); //p=8
        BigRectFilter recEight = new BigRectFilter(1,2); //p=6
        BigRectFilter recNine = new BigRectFilter(3,2); //p=10
        BigRectFilter recTen = new BigRectFilter(1,1); //p=4

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

        //outputs the array list of Rectangle Objects before going to BigRectFilter
        System.out.println();
        System.out.println("All rectangles in the ArrayList");

        for(BigRectFilter r: rectangles)
        {

            System.out.println(r + " The perimeter is: " + r.getPerimeter());
        }


        //outputs the list of rectangles that have a perimeter bigger than 10
        System.out.println();

        System.out.println("Big Perimeter Rectangles");

        for(BigRectFilter newR : rectangles)
        {
            if (newR.accept(newR) == true)
            {
                System.out.println(newR + " The perimeter is: " + newR.getPerimeter());
            }


        }

        System.out.println();
        System.out.println("Small Perimeter Rectangles");

        for(BigRectFilter newR : rectangles)
        {
            if (newR.accept(newR) == false)
            {
                System.out.println(newR + " The perimeter is: " + newR.getPerimeter());
            }


        }





    }
}
