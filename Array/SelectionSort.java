package Array;
import java.util.Scanner;
class SelectionSort
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        int ar[] = {5,3,8,5,7,2,9,1,0,10};
        int temp;
        
        int min;
        for(int i=0; i<9; i++)
        {
            min = i;
            for(int j=i+1; j<10; j++)
            {
                if(ar[min] > ar[j])
                {
                    min = j;
                }
            }
            temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
        
        for(int i=0; i<10; i++)
        {
            System.out.print(ar[i] + ", ");
            
        }
    }
}