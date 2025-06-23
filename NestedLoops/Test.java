package NestedLoops;
import java.util.Scanner;
class Test
{
    static void main()
    {   int n;
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        
        switch(ch)
        {
            case 1:
                n = sc.nextInt();
                System.out.print("The fibonacci series is: 0, ");
                for(int f=0,s=1; n>=s; n++)
                {
                    System.out.print(s+", ");
                    int temp = f;
                    f = s;
                    s += temp;
                }
                break;
            case 2:
                n = sc.nextInt();
                System.out.print("The factors of "+n+" are: ");
                for(int i=1; i<=n; i++)
                {
                    if(n%i==0)
                        System.out.print(i+", ");
                }
                break;
        }
    }
    static void GCD()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the larger and smaller number respectively for the G.C.D");
        int larger = sc.nextInt();
        int smaller = sc.nextInt();
        for(int i=smaller; i>=1; i--)
        {
            if(larger%i==0 && smaller%i==0)
            {
                System.out.println(i+" is the GCD");
                break;
            }
        }
    }
    static void pattern()
    {
        /*
         * To display pattern:
         * 
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 
         * 
         */
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
                System.out.print(j);
            System.out.println();
        }   
    }
    
    
}
