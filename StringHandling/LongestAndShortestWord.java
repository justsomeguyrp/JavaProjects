package StringHandling;
import java.util.Scanner;
class LongestAndShortestWord
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str = str.trim();
        str += " ";
        String word="", longest="", shortest="" ;
        int len, lenL=0, lenS=str.length();
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                len = word.length();
                if(len>lenL)
                {
                    lenL = len;
                    longest = word;
                }
                if(len<lenS && lenS>0)
                {
                    lenS = len;
                    shortest = word;
                }
                System.out.println("Iteration "+i+" is: "+longest+"\t"+shortest);
                word = "";
            }
            else
                word += ch;
        }
        System.out.println("The longest is: "+longest+" with length: "+lenL);
        System.out.println("The shortest is: "+shortest+" with length: "+lenS);
    }
}
