package StringHandling;
import java.util.Scanner;
class Frequency
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int count;
        char c;
        for(int i='A'; i<='Z'; i++)
        {
            count=0;
            for(int j=0; j<str.length(); j++)
            {
                c = str.charAt(j);
                if(c==i)
                    count ++;
                
            }
            
            System.out.println("The frequency of "+i+" is: "+count);
        }
    }
}