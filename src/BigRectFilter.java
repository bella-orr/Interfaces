public class BigRectFilter implements Filter
{
    //declarations
    double width;
    double height;


    public BigRectFilter(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "BigRectFilter{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


    @Override
    public boolean accept(Object x)
    {
        //declarations
        double perimeter;

        //get the perimeter of the rectangle object
        perimeter = 2*(this.width+this.height);

        //if the perimeter is greater than 10, return true
        if (perimeter > 10)
        {
            return true;
        }

        return false;
    }
}
