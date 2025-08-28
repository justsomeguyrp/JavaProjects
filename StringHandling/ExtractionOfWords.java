package StringHandling;
import java.util.Scanner;
class ExtractionOfWords
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine(); // |Hello World|
        s = s.trim();
        s += " ";
        String word = "";
        char c;
        for(int i=0; i<s.length(); i++)
        {
            c = s.charAt(i);
            if(c != ' ')
            {
                word += c;
            }
            else
            {
                System.out.println(word);
                word = "";
            }
        }
    }
}