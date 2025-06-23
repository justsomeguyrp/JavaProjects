package NestedLoops;
class HardestPattern
{
    static void main()
    {
        for(int i=5; i>=1; i--)
        {
            for(int k=1; k<=5-i; k++)
                System.out.print(" ");
            for(int j=1; j<=i; j++)
                System.out.print(j+" ");
            for(int l=1; l<=i; l++)
                System.out.print(" ");
            System.out.println();
        }
    }
}