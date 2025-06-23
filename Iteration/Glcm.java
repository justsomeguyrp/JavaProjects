package Iteration;
import java.util.Scanner;
class Glcm
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int divd = sc.nextInt();//20
        int div = sc.nextInt();//4
        int r;
        int f=divd, s=div;
        while(div>0)
        {
            r = divd%div;
            divd = div;
            div = r;
        }
        System.out.println("GCD is: "+divd);
        double lcm = f*s/divd;
        System.out.println("LCM is: "+lcm);
    }
}