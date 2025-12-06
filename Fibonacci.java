class Fibonacci
{
    static void main()
    {
        int temp; 
        int n = 10;
        
        for(int f=0, s=1, i=1; i<=n;i++)
        {
            System.out.print(s+",");
            temp = s;
            s = s+f;
            f = temp;
        }
    }
}


