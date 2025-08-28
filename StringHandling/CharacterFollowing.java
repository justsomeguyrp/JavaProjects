package StringHandling;
import java.util.Scanner;
class CharacterFollowing
{
    //Q11
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String s1 = sc.next();
        String s2 = sc.next();
        String fin = "";
        char c1, c2;
        for(int i=0; i<s1.length(); i++)
        {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            fin += c1;
            fin += c2;
        }
        System.out.println(fin);
        
    }
}