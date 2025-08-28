package StringHandling;

class Pattern
{
    static void lab_bluej()
    {
        String str = "BLUEJ";
        for(int i=5; i>=1; i--)
        {
            System.out.println(str.substring(0,i));
        }
    }
    
    static void lab_icse()
    {
        String str = "ICSE";
        for(int i=1; i<=4; i++)
        {
            System.out.println(str.substring(0,i));
        }
    }
    
    static void asciiPattern()
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
                System.out.print((char)(j+64));
            System.out.println();
        }
    }
    

    static void floydString()
    {
        for(int i=1, n=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++,n++)
                System.out.print((char)(n+64));
            System.out.println();
        }
    }
    

}