package SideProjects;
import java.util.Scanner;

public class Rectangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Length: ");
        int l = sc.nextInt();
        System.out.println("Enter the Breadth: ");
        int b = sc.nextInt();
        char[] sl = new char[b];
        char[] ul = new char[b];
        
        for (int i = 0; i<b; i++)
        {
            sl[i] = ' ';
            ul[i] = '_';
        }
        
        System.out.print('_');
        System.out.print(ul);
        System.out.println('_');
        
        for (int i = 1; i<l-1; i++)
        {    
            System.out.print('|');
            System.out.print(sl);
            System.out.println('|');
        }
        
        System.out.print('|');
        System.out.print(ul);
        System.out.print('|');
        
        System.out.println("\n\nArea of the rectangle is: "+(l*b));
        System.out.println("Perimeter of the rectangle is: "+(2*l+b));
    }
}