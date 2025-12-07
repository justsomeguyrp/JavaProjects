package Conditional_Statements;

class SecondLowestNumber
{
    static int main(int a, int b, int c)
    {
        int d = Math.max(Math.min(a,b), Math.max(Math.min(b,c),Math.min(a,c)));
        return d;
    }
}
