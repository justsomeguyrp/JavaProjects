package Iteration;
import java.util.Scanner;
class Gcd
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int divd = sc.nextInt();
        int div = sc.nextInt();
        int r;
        while(div>0)
        {
            r = divd%div;
            divd = div;
            div = r;
        }
        System.out.println(divd);
    }
}
