package Iteration;

class fibonazzi
{
    static void main()
    {
        int a=0,b=0,c=1;
        System.out.print("The fibonazzi series is: 0, 1, ");
        for(int i=1;c<=10;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(c+", ");
        }
        
    }
}