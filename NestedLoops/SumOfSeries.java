package NestedLoops;
import java.util.Scanner;
class SumOfSeries
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
                int prod = 1;
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            prod *= i;
            sum += prod;
        }
        System.out.println(sum);
    }
}