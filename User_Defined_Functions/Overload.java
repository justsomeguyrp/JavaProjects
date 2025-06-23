package User_Defined_Functions;

class Overload
{
    static void func(int n)
    {
        System.out.println(n+1);
    }
    static void func(int n, int i)
    {
        System.out.println(n+i);
    }
    public static void main(String args[])
    {
        func(5);
        func(10, 20);
    }
}