package NestedLoops;

class Pattern
{
    static void increasingContinuous()
    {
        int main=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(main+" ");
                main++;
            }
            System.out.println();
        }
    }
    static void labActivityTwo()
    {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
        for(int i=2; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void annoyingProblem()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1, k=i; j<=i; j++, k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}