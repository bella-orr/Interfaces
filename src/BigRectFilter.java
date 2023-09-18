public class BigRectFilter implements Filter
{
    //implements the filter interface
    @Override
    public boolean accept(Object x)
    {
        //declarations
        double perimeter;
        Rectangle rec = (Rectangle) x;

        //get the perimeter of the rectangle object
        perimeter = 2*(rec.width+rec.height);

        //if the perimeter is greater than 10, return true
        if (perimeter > 10)
        {
            return true;
        }

        return false;

    }
}
