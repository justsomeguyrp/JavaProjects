package NestedLoops;
import java.util.Scanner;
    
public class DoublePattern
{
    static void one()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=4; i++)
        {
            for(int j=4; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void two()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1, n=i; j<=i; j++){
                System.out.print(n);
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--)
        {
            for(int j=1, n=i; j<=i; j++)
            {
                System.out.print(n);
            }
            System.out.println();
        }
    }

}
