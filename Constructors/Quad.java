package Constructors;

class Quad
{
    double a,b,c,d, r1, r2;
    
    Quad(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
        d = 0;
        r1 = 0;
        r2 =0;
    }
    
    void calculate()
    {
        d = b*b-4*a*c;
        
        if(d<0)
            System.out.println("Roots are not possible");
        else
        {
            r1 = (-b + Math.sqrt(d))/2*a;
            r2 = (-b - Math.sqrt(d))/2*a;
            System.out.println(r1+"\t"+r2);
        }
    }
    
    public static void main(String args[])
    {
        Quad ob = new Quad(1, 1, -12);
        ob.calculate();
    }
    
}