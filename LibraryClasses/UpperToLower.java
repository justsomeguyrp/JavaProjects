package LibraryClasses;
import java.util.Scanner;
class UpperToLower
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(Character.isLetter(ch))
        {
            if(Character.isUpperCase(ch))
                System.out.println(Character.toLowerCase(ch));
            else
                System.out.println(Character.toUpperCase(ch));
        }
        else
            System.out.println(ch+" is not a letter");
            
    }
}