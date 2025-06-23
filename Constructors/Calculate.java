package Constructors;

class Calculate
{
    int num, f, rev;
    
    Calculate(int n)
    {
        num = n;
    }
    int prime()
    {
        for(int i=2; i<=num/2; i++)
        {
            if(num%i==0)
                return 0;
        }
        return 1;
    }
    int reverse()
    {
        int rev=0, r, p=num;
        while(num>0)
        {
            r = num%10;
            rev = rev*10 + r;
            num /=10;
        }
        if(p==rev)
            return 0;
        else
            return 1;
    }
    void display(int a, int b)
    {
        if(a == 0 && b == 0)
            System.out.println("The number: "+num+" is a prime palindrome");
        else
            System.out.println("The number: "+num+" is not a prime palindrome");
    }
    public static void main()
    {
        Calculate ob = new Calculate(11);
        
    }
}