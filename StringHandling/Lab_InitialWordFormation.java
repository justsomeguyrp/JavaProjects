package StringHandling;
import java.util.Scanner;
class Lab_InitialWordFormation
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String word = "", newStr = "";
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                newStr += word.charAt(i);
                word = "";
            }
            else
                word += ch;
        }
        newStr += word;
        System.out.println("The string is: "+newStr);
    }
}