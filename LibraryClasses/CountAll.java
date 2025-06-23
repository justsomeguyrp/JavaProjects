package LibraryClasses;
import java.util.Scanner;

class CountAll
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch;
        int ctu=0, ctl=0, ctn=0, cts=0;
        for(int i=1; i<=10; i++)
        {
            System.out.println("Enter character "+i+": ");
            ch = sc.next().charAt(0);
            if(Character.isLetter(ch))
            {
                if(Character.isUpperCase(ch))
                    ctu++;
                else
                    ctl++;
                    
            }
            else if(Character.isDigit(ch))
                ctn++;
            else
                cts++;
            
        }
        System.out.println("Upper case\tLower case\tNumbers\tSpecial characters");
        System.out.println(ctu+"\t"+ctl+"\t"+ctn+"\t"+cts);
    }
}
