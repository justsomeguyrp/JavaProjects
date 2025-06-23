package Conditional_Statements;
import java.util.Scanner;
class PerfectSquare
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        double sq = Math.sqrt(n);
        sq = (int)sq;
        if(sq*sq == n)
        {
            System.out.println("Number is perfect square");
        
        }
        else
        {
            System.out.println("Number isn't perfect square");
        }
    }
}