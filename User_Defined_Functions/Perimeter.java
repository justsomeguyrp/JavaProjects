package User_Defined_Functions;

class Perimeter
{
    static double perimeter(int s)
    {
        return 4*s;
    }
    static double perimeter(int l, int b)
    {
        return l*b;
    }
    static double perimeter(double r)
    {
        return 22/7.0 * r*r;
    }
    public static void main(String args[])
    {
        System.out.println(perimeter(10));
        System.out.println(perimeter(12, 3));
        System.out.println(perimeter(9.0));
    }
}