package Array;
import java.util.Scanner;
class Negative
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int a[] = new int[10];
        
        for(int i=0; i<10; i++)
        {
            System.out.println("Enter number: "+(i+1));
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<10; i++)
        {
            if(a[i] < 0)
                System.out.print(a[i]+", ");
        }
        
        for(int i=0; i<10; i++)
        {
            if(a[i] > 0)
                System.out.print(a[i]+", ");
        }
    }
}