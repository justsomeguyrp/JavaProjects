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
    
    static void reverse_bluej()
    {
        String str = "BLUEJ";
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
                System.out.print(str.charAt(4-i));
            System.out.println();
        }
    }
    
    
    static void hard_pattern()
    {
        /*
         * B
         * LU
         * EJB
         * LUEJ
         * BLUEJ
         */
        
        String str = "BLUEJ";
        
        for(int i=1,n=0; i<=5; i++)
        {
            for(int j=1; j<=i; j++, n++)
            {
                if(n==5)
                    n=0;
                System.out.print(str.charAt(n));
            }
            System.out.println();
        }
    }
    
    static void skip_two_pattern()
    {
        /*ABCDEF
         *BLUEJ
          ABCD
          BLU
          AB
          B
        */
       
       
       String s1 = "BLUEJ", s2="ABCDEF";
       
       for(int i=0; i<6; i++)
       {
           System.out.println(s2.substring(0,6-i));
           i++;
           System.out.println(s1.substring(0,6-i));
       }
    }
}