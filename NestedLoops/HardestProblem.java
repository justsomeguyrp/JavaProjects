package NestedLoops;
import java.util.Scanner;
class HardestProblem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of numbers for the pattern: ");
        long counter = sc.nextLong();       
        for(long i=counter; i>=1; i--)
        {
            for(int k=1; k<=counter-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(j+" ");
            
            System.out.println();   
        }
    }
}