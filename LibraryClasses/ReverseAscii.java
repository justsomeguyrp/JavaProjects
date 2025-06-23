package LibraryClasses;
import java.util.Scanner;
class ReverseAscii
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char ch = sc.next().charAt(0);
        int num = ch, rev=0, r;
        int p=num;
        
        while(p>0)
        {
            r = p%10;
            rev = rev*10+r;
            p/=10;
        }
        
        char ch2 = (char)rev;
        System.out.println("The reversed ascii character is: "+ch2);
    }
}