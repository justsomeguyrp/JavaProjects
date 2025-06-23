package Constructors;
import java.util.Scanner;
class Population
{
    int p, r;
    
    Population(int x, int y)
    {
        p = x;
        r = y;
    }
    
    void print()
    {
        double ans = p*(1+r/100.0);
        System.out.print("The population is: "+ans);
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=7; i++)
        {
            
            System.out.println("Enter the initial population of year"+(2000+i)+": ");
            int p = sc.nextInt();
            System.out.println("Enter the growth rate: ");
            int r = sc.nextInt();
            Population ob = new Population(p, r);
            ob.print();
            System.out.println();
        }
    }
}