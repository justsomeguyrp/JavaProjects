package StringHandling;
import java.util.Scanner;
class ConversionOfVowelsToAsterisk
{
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine(), newStr="";
        char c;
        for(int i=0; i<str.length(); i++)
        {
            c = str.charAt(i);
            if(c == 'E' || c=='e')
                newStr += '*';
            else
                newStr += c;
        }
        System.out.println(newStr);
    }
}