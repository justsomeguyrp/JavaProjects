package Iteration;
import java.util.Scanner;
class Factorial
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(), fact=1;
        
        for(int i=1; i<=n; i++)
            fact *= n;
        System.out.println("Factorial is: "+fact);
    }
}