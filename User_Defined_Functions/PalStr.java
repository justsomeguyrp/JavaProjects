package User_Defined_Functions;
import java.util.Scanner;
class PalStr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String pal = "";
        
        char j;
        for(int i=x.length()-1; i>=0; i--)
        {   
            j = x.charAt(i);
            pal+=j;
        }
        System.out.println(pal);
        if(x.equals(pal))
            System.out.println(x+" is palindrome");
        else
            System.out.println(x+" is not palindrome");
    }
    
}