package Array;
import java.util.Scanner;
class FirstLetterMatchingWithLastLetter
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[10];
        System.out.println("Enter 10 words: ");
        
        for(int i=0; i<10; i++)
        {
            a[i] = sc.next();
        }
        
        for(int i=0; i<10; i++)
        {
            if(a[i].charAt(0) == a[i].charAt(a[i].length()-1))
                System.out.println(a[i]+" has matching letter");
        }
    }
}