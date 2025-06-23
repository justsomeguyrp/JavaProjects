package LibraryClasses;
import java.util.Scanner;
class SetOf20
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        for(int i=1; i<=2; i++)
        {
            System.out.println("Enter character "+i+": ");
            ch = sc.next().charAt(0);
            ch = Character.toUpperCase(ch);
            switch(ch)
            {
                case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println(ch+" is a vowel");
                break;
                
                default:
                    System.out.println(ch+" is a consonant");
            }
        }
    }
}