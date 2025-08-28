package StringHandling;
import java.util.Scanner;
class DisplayEachAscii
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char c;
        for(int i=0; i<str.length(); i++)
        {
            c = str.charAt(i);
            System.out.println(c+"\t"+(int)(c));
        }
    }
}