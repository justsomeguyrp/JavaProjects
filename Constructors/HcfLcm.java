package Constructors;
import java.util.Scanner;
class HcfLcm
{
    int a,b;
    
    HcfLcm(int x, int y)
    {
        a = x;
        b = y;
    }
    void calculate()
    {   
        int r;
        int divd = Math.max(a,b); //dividend
        int div = Math.min(a, b); //divisor
        
        
        while(div>0)
        {
            r = divd%div;   
            divd = div;
            div = r;
        }
        
        System.out.println("The GCD is: "+divd);  
        int lcm = a*b/divd;
        System.out.println(lcm);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 2 nums: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        HcfLcm ob = new HcfLcm(a, b);
        ob.calculate();
    }
}