package Iteration;

class XylemAndPhloemNumbers
{
    public static void main(int n)
    {
        int last = n%10, temp=0, ct=0, p=n;
        n = n/10;
        double sum=0;
        while(n>10)
        {
            temp = n%10;
            sum += temp;
            n /= 10;

        }
        int first = n;
        if((first+last) == sum)
        {
            System.out.println(p+" is a xylem number");
        }
        else
        {
            System.out.println(p+" is a phloem number");
        }
    }
}