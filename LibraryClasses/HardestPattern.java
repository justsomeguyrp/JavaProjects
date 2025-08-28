package LibraryClasses;

class HardestPattern
{
    public static void main(String args[])
    {
        for(int i=5; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
                System.out.print((char)(j+64));
            for(int k=1; k<=(5-i); k++)
                System.out.print((char)(k+64));
                
            System.out.println();
        }

    }
}