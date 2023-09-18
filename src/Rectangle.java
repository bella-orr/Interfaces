//Object Rectangle created for part 2 of lab

public class Rectangle
{
    //declarations
 double width;
 double height;

  //constructor
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    //getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //to string


    @Override
    public String toString()
    {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
