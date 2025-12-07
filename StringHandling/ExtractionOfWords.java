package StringHandling;
import java.util.Scanner;

/*
 * Extracts each word of the sentence given and prints in different lines
 */
class ExtractionOfWords
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); // HELLO WORLD
        String s = sc.nextLine(); 
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