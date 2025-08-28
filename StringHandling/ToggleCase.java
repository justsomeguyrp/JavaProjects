package StringHandling;
import java.util.Scanner;
class ToggleCase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = sc.nextLine();
        for(int i=0; i<=str.length()-1; i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
                System.out.print(Character.toLowerCase(str.charAt(i)));
            else
                System.out.print(Character.toUpperCase(str.charAt(i)));
        }
    }
}