package Constructors;

class Calculate
{
    int num, f, rev;
    
    Calculate(int n)
    {
        num = n;
        f = 0;
        rev = 0;
    }
    void prime()
    {
        for(int i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                f = 0;
                return;
            }
        }
        f = 1;
    }
    void reverse()
    {
        int rev=0, r, p=num;
        while(p>0)
        {
            r = p%10;
            rev = rev*10 + r;
            p /=10;
        }
        
    }
    void display()
    {
        if(f == 1 && rev == num)
            System.out.println("The number: "+num+" is a prime palindrome");
        else
            System.out.println("The number: "+num+" is not a prime palindrome");
    }
    public static void main()
    {
        Calculate ob = new Calculate(11);
        
    }
}