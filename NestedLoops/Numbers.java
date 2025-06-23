package NestedLoops;

class Numbers
{
    static boolean pronic(int n)
    {
        for(int i=1; i<=n/2; i++)
        {
            if(i*(i+1) == n)
                return true;
        }
        return false;
    }
    static double gcd(int d1, int d2)   
    {
        int temp1=d1, temp2=d2;
        int r;
        while(d2>0)
        {
            r = d1%d2;
            d1 = d2;
            d2 = r;
        }
        double gcd = d1;
        return (temp1*temp2)/gcd;
    }
}