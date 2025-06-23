package NestedLoops;

class ActualFloydsTriangle
{
    static void main(){
        for(int i=1, n=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++, n++)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
}
}