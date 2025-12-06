package StringHandling;
import java.util.Scanner;
class TelephoneNumbers
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[20];
        String name[] = new String[20];
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter phone numbers: "+(i+1)+": ");
            num[i] = sc.nextInt();
            System.out.println("Enter name: "+(i+1)+": ");
            name[i] = sc.next();
        }
        int min, tmp;
        String t;
        
        for(int i=0; i<5; i++)
        {
            min = i;
            for(int j=min; j<5; j++)
            {
                if(name[min].compareTo(name[j]) > 0)
                    min = j;
            }
            t = name[min];
            name[min] = name[i];
            name[i] = t;
            
            tmp = num[min];
            num[min] = num[i];
            num[i] = tmp;
        }
        
        for(int i=0; i<20; i++)
        {
            System.out.println(name[i] + "\t"+ num[i] );
        }
        
    }
}