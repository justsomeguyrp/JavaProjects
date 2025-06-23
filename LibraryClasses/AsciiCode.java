package LibraryClasses;
import java.util.Scanner;
class AsciiCode
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 characters: ");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        
        int i1 = (int)(c1);
        int i2 = (int)c2;
        int d = i2-i1;
        
        if(d==0)   
            System.out.println(c1+" and "+c2+" are the same character");
        else if(d>0)
            System.out.println(c1+" is smaller than "+c2);
        else    
            System.out.println(c1+" is larger than "+c2);
    }
}