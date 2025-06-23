package Iteration;
import java.util.Scanner;
class TwistedPrime
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int flag = 0;
        
        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
                flag=1;
        }
        if(flag == 1)
            System.out.println(n+ " is not prime");
        else
        {
            int rev=0, r;
            while(n>0)
            {
                r = n%10;
                rev = rev*10 + r;
                n/=10;
            }
            for(int i=1; i<=rev/2; i++)
            {
                if(n%i==0)
                    flag=1;
            }
            if(flag == 1)
                System.out.println("Not a twisted prime");
            else
                System.out.println("A twisted prime");
        }
    }
}