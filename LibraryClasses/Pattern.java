package LibraryClasses;

class Pattern
{
    static void skip_ten()
    {
        int n=65;
        for(int i=1; i<=5; i++, n-=4)
        {
            if(n>=90)
                n = 65 + (n-90);
            if(n<=65)
                n = 90 - (65-n);
            System.out.print((char)(n));
            n += 10;
            if(n>=90)
                n = 65 + (n-90);
            if(n<=65)
                n = 90 - (65-n);
            System.out.print((char)(n));
            System.out.println();
        }
    }
    static void hard_pattern()
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
    static void hardest_pattern()
    {
        /*
         * ABCDE
         * ABCDA
         * ABCAB
         * ABABC
         * AABCD
         */
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