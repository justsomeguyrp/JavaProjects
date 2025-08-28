package StringHandling;
import java.util.Scanner;
class VowelSwitchAfterLetter
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s =sc.nextLine();
        String S1 = "";
        char c;
        for(int i=0 ;i<s.length();i++)
        {
            c=s.charAt(i);
            c = Character.toUpperCase(c);
            if(c=='A'||c=='E' || c=='I'||c=='O'||c=='U')
            {
                S1 += (char)(c+1);  
            }
            else
            {
                S1 += c;
            }
        }
        System.out.println(S1);
    }
}