package Conditional_Statements;
import java.util.Scanner;
class Buzz
{
    static void main()
    {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n%7==0 && n%10==7)
            System.out.println(n+" is buzz");
        else
            System.out.println(n+" is not buzz");
    }
}