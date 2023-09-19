public class ShortWordFilter implements Filter
{


    //implements the Filter interface
    @Override
    public boolean accept(Object x)
    {
        //checks to see if x is of the String family using instanceof
        if(x instanceof String)
        {
            String str = (String) x;

                return str.length()<5;
        }


        //x is not a string
        return false;
    }

}
