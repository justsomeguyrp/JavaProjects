package User_Defined_Functions;
import java.util.Scanner;
class Series
{
    static double series(double n)
    {
        double sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum += 1/i;
        }
        return sum;
    }
    static double series(double a, double n)
    {
        double sum=0;
        for(int i=1; i<=n; i+=3)
        {
            sum += i/Math.pow(a,i+1); 
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter another number: ");
        int a = sc.nextInt();
        series(n);
        series(a, n);
    }
}