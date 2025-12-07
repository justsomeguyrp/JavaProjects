package Constructors;

class Calculate_
{
    int num, f, rev;
    
    Calculate_(int n)
    {
        num = n;
        f = 0;
        rev = 0;
    }
    int prime()
    {
        for(int i=2; i<=num/2; i++)
        {
            if(num%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    int reverse()
    {
        int rev=0, r, p=num;
        while(p>0)
        {
            r = p%10;
            rev = rev*10 + r;
            p /=10;
        }
        if(rev == num)
            return 0;
        else
            return 1;
        
    }
    void display(int f, int r)
    {
        if(f == 0 && r == 0)
            System.out.println("The number: "+num+" is a prime palindrome");
        else
            System.out.println("The number: "+num+" is not a prime palindrome");
    }
    public static void main()
    {
        Calculate_ ob = new Calculate_(11);
        int p = ob.prime();
        int r = ob.reverse();
        ob.display(p, r);
        
    }

}
