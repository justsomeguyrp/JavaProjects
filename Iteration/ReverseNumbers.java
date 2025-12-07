package Iteration;
import java.util.Scanner;
class ReverseNumbers
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt(); //789
        int r, rev=0;
        int p = n; //this is optional to check for palindrome or in this case for printing nicely
        //the semicolons indicate next iterations
        while(n>0)
        {
            r = n%10; //last digit => 9; 8; 7
            rev = rev * 10 + r; //9; 98; 987
            n /= 10; //78; 7; 0
        }
        // rev is reversed number
        System.out.println("The reveresed of "+p+" is: "+rev);
    }
}