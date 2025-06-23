package Iteration;

import java.util.Scanner;
class Question2
{
    static void main()
    {
        int n, sumP=0, sumN = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=3; i++)
        {
            n = sc.nextInt();
            if(n>0)
            {
                System.out.println(n+" is positive");
                sumP++;
            }
            else
            {
                System.out.println(n+" is negative");
                sumN++;
            }
            
        }
        System.out.println("Total positive numbers: "+sumP);
        System.out.println("Total negative numbers: "+sumN);
    }
}
