package Array;
import java.util.Scanner;
class StringBinarySearch
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        String ar[] = new String[8];
        
        System.out.println("Enter elements for string array: ");
        for(int i=0; i<8; i++)
        {
            ar[i] = sc.next();
        }
        
        int l=0, u=8, m;
        System.out.println("Enter element to be searched: ");
        String s = sc.next();   
        while(l<=u)
        {
            m = (l+u)/2;
            if(ar[m].compareToIgnoreCase(s) < 0)
                l = m+1;
            else if(ar[m].compareToIgnoreCase(s) > 0)
                u = m-1;
            else
            {
                System.out.println("Element is add index: "+m);
                System.exit(0);
            }
        }
    }
}