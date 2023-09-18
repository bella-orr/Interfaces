public class ShortWordFilter implements Filter
{

    //implements the Filter interface
    @Override
    public boolean accept(Object x)
    {
        //checks to see if x is of the String family using instanceof
        if(x instanceof String)
        {
            if(((String) x).length()<5)
            {
                return true;
            }

            //if the length of x > 5
            else
            {
                return false;
            }
        }

        //x is not a string
        return false;
    }

}
