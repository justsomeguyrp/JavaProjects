package StringHandling;
import java.util.Scanner;
class InitialsOfName
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String s=sc.nextLine();
        s = s.trim();
        s = " " + s;
        String S1="";
        char c;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
              S1+=s.charAt(i+1) + " ";
            }
            
        }
        System.out.println(S1);
    }
}