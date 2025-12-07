package NestedLoops;

class PalindromeAndPrimeUsingBoolean
{
    static boolean isPalindromePrime(int n)
    {
        boolean isPrime= true;
        boolean isPal = false;
        
        //int flag=0;
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                isPrime = false;
                break;
            }
        }
        
        int p=n, rev=0, r;
        while(n>0)
        {
            r = n%10;
            rev = rev*10+r;
            n/=10;
        }
        if(p==rev)
            isPal = true;
        else
            isPal = false;
        
        if(isPal==true && isPrime==true)
            return true;
        else
            return false;
    }
    
    public static void main(String args[])
    {
        System.out.println("The palindrome prime numbers are below - ");
        int ct = 1;
        for(int i=10;;i++) // to start from 11
        {
            if (isPalindromePrime(i) == true)
            {
                System.out.println(ct+": "+i);
                ct++;
            }
            if(ct>100)
                break;
        }
    }
    
}