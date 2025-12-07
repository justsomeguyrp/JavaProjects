package Iteration;
import java.util.Scanner;
class FibonacciAndSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1: System.out.print("The fibonacci series for 10 digits is: 0,");
                for(int f=0, s=1;s<=10;)
                {
                    System.out.print(s+",");
                    int temp = f;
                    f = s;
                    s += temp;
                }
            case 2: 
                int n = sc.nextInt(), sum=0;
                for(int i=1; i<=n; i++)
                {
                    sum += i;
                }
                break;
            default: System.out.println("Invalid choice");
                
        }
    }
}
