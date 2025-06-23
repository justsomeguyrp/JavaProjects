package Iteration; 
import java.util.Scanner;
class Fibonacci
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp;
        System.out.print("Fibonacci series: 0, ");
        for(int f=0, s=1; s<=n;)
        {
            System.out.print(s+", ");
            temp = f;
            f = s;
            s += temp;
        }
    }
}
