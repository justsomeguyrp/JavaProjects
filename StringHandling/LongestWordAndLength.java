package StringHandling;
import java.util.Scanner;
class LongestWordAndLength
{
    public static void main()
    {
        String str = "12 123 12345 1234";
        String word="", longest="";
        int longest_len=0;
        char ch;
        str = str.trim();
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(i==str.length()-1)
                word += ch;
            if(Character.isWhitespace(ch) || i==str.length()-1)
            {
                if(word.length() > longest_len)
                {
                    longest = word;
                    longest_len = word.length();
                }
                word = "";
            }
            else
                word += ch;
        }
        System.out.println(longest+"\t"+longest_len);
    }
}