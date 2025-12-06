package Array;
import java.util.Scanner;
class Resultant
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        int a[] = new int[6];
        int b[] = new int[6];
        System.out.println("Enter array elements for 'a': ");
        for(int i=0; i<6; i++)
            a[i] = sc.nextInt();
        for(int i=0; i<4; i++)
            b[i] = sc.nextInt();
        
        int c[] = new int[10];
        
        for(int i=0; i<10; i++)
        {
            if(i>6)
                c[i] = b[i-6];
            else
                c[i] = a[i];
        }
        
    }
}