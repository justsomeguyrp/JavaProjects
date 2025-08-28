package LibraryClasses;

class HardPattern
{
    public static void main(String args[])
    {
        /*
         * 12345
         * 2345
         * 345
         * 45
         * 5
        */
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=5; j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}