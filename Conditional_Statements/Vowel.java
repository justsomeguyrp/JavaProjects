package Conditional_Statements;
import java.util.Scanner;
class Vowel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            System.out.println(ch+" is a vowel");
            break;
            
            default:
                System.out.println(ch+" is a consonant");
        }
    }
}