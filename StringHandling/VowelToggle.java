package StringHandling;
import java.util.Scanner;
class VowelToggle
{
    static void main()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine(), s1="";
        char c;
        for(int i=0; i<s.length(); i++)
        {
            c = s.charAt(i);
            
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                s1 += Character.toUpperCase(c);
            else if(c == 'A' || c== 'E' || c=='O' || c=='U')
                s1 += Character.toLowerCase(c);
            else
                s1 += c;
        }
    
    System.out.println(s1);
    }
}