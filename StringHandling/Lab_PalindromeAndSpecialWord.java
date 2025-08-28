package StringHandling;
import java.util.Scanner;
class Lab_PalindromeAndSpecialWord
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine(), rev="";
        boolean palindrome, special;
        special = str.charAt(0) == str.charAt(str.length()-1);
        
        for(int i=str.length()-1; i>=0; i--)
        {
            rev += str.charAt(i);
        }
        
        palindrome = str.equals(rev);
        
        if(palindrome && special)
            System.out.println(str+ " is both special and palindrome");
        else if(palindrome)
            System.out.println(str+ " is only a palindrome");
        else if(special)
            System.out.println(str+ " is only special");
        else
            System.out.println(str+ " is neither palidrome nor special");
    }
}