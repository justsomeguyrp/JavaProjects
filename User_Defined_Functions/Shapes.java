package User_Defined_Functions;
import java.util.Scanner;

class Shapes
{
    static double volume(double r) //sphere
    {
        return (4/3.0 * 22/7.0 * Math.pow(r,3));
    }
    static double volume(double h, double r) //cylinder
    {
        return (22/7.0*r*r*h);
    }
    static double volume(double l, double b, double h) //cuboid
    {
        return l*b*h;
    }
    public static void main(String args[])
    {
        double r, h, l, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        System.out.println("Volume of sphere is: "+volume(sc.nextDouble())); //for sphere
        
        System.out.println("Enter height and radius: ");
        h = sc.nextDouble();
        r = sc.nextDouble();
        System.out.println("Volume of cylinder is: "+volume(h, r)); //for cylinder
        
        
        l = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        System.out.println("Volume of cuboid is: "+volume(l, b, h)); //for cuboid
        
    }
    
}