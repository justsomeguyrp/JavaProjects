package Iteration;

class Automorphic
{
    static void main(int n)
    {
        int div=1, p=n;
        while(n>0)
        {
            div *= 10;
            n/=10;
        }
        if(p*p%div == p)
            System.out.println(p+" is automorphic");
        else
            System.out.println(p+" is not automorphic");
    }
}