package LibraryClasses;
import java.util.Scanner;
class MenuDrivenAlphabets
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 for Z-A\nEnter 2 for a-z");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
                for(int i=90; i>=65; i--)
                {
                    System.out.print((char)i+", ");
                }
                break;
            case 2:
                for(int i=97; i<=122; i++)
                {
                    System.out.print((char)i+", ");
                }
                break;
        }
    }
}