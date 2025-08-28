package StringHandling;
import java.util.Scanner;
class HappyWord
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        //89 
        System.out.println("Enter a word");
        String str= sc.next();
        int sum = 0, num;
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            num = ch;
            while(num>0)
            {
                sum += (num%10)*(num%10);
                num /= 10;
            }
        }
    }
}