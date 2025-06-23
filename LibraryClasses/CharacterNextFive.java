package LibraryClasses;
import java.util.Scanner;
class CharacterNextFive
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        int n=(int)(ch);
        for(int i=1; i<=5; i++)
        {
            
            System.out.println((char)(++n));
        }
    }
}