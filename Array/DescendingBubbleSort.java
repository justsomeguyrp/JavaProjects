package Array;
import java.util.Scanner;
class DescendingBubbleSort
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[10], temp;
        System.out.println("Enter elements for array: ");
        for(int i=0; i<10; i++)
        {
            ar[i] = sc.nextInt();
        }
        
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(ar[j] < ar[j+1])
                {
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        
        for(int i=0; i<10; i++)
        {
            System.out.println(ar[i]);
        }
    }
}