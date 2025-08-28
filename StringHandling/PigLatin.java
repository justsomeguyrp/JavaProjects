package StringHandling;
import java.util.Scanner;
class PigLatin
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine(), str="";
        s = s.trim();
        s += " ";
        String end = "";
        char c, ch; //people
        for(int m=0; m<s.length(); m++)
        {
            c = s.charAt(m);
            if(Character.isWhitespace(c))
            {
                //System.out.println("The string at iteration "+m+" is: "+str);
                for(int i=0; i<=str.length(); i++)
                {
                    ch = str.charAt(i);
                    ch = Character.toLowerCase(ch);
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                        break;
                    else
                    {
                        end += ch;
                    }
                }
                if(end.length()==str.length())
                    str = end+"ay";
                else
                    str = str.substring(end.length()) + end + "ay";
                System.out.print(str+" ");
                str = "";
                end = "";
            }
            else
                str += c;
        }
    }
}