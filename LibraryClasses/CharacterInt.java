package LibraryClasses;
import java.util.Scanner;
class CharacterInt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int n = (int)(ch);
        char ch2 = (char)(n+10);
        System.out.println("The character is: "+ch2);
    }
}