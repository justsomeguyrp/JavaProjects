package StringHandling;
import java.util.Scanner;
class Lab_Vowel_Removal
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine(), str2="";
        str = str.trim();
        str = str.toLowerCase();
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                str2 += (char)(ch+1);
            else
                str2 += ch;
        }
        System.out.println(str2);
    }
}