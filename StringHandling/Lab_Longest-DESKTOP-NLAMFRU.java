package StringHandling;
import java.util.Scanner;
class Lab_Longest
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string; ");
        String str = sc.nextLine(), word = "", longest="";
        str = str.trim();
        str += " ";
        char ch;
        for(int i=0; i<str.length()-1; i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                if(word.length() > longest.length())
                    longest = word;
                word = "";
            }
            else
                word += ch;
            
        }
        System.out.println("The longest word is "+longest+"\n The length of longest word is: "+longest.length());
    }
}