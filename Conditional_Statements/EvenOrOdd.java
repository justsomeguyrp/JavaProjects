package Conditional_Statements;

import java.util.Scanner;
class EvenOrOdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        
        if (num % 2 == 0)
        {
            System.out.println(num+" is even") ;
        }
        else{
            System.out.println(num+" is odd");
        }
        sc.close();
    }
}
