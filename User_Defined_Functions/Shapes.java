package User_Defined_Functions;

class Shapes
{
    static double volume(double r)
    {
        return 4/3.0 * 22/7.0 * Math.pow(r,3);
    }
    static double volume(double h, double r)
    {
        return 22/7.0*r*r*h;
    }
    static double volume(double l, double b, double h)
    {
        return l*b*h;
    }
    public static void main(String args[])
    {
        //Code goes here
    }
    
}