package Array;
import java.util.Scanner;
class BinarySearch
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sorted array: ");
        int ar[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Enter number to be found: ");
        int n = sc.nextInt();
        
        int least = 0, highest = ar.length-1, middle;
        
        while(least<=highest){
            middle = (least+highest)/2;
            if(ar[middle] < n)
                least = middle + 1;
            if(ar[middle] > n)
                highest = middle - 1;
            
            if(ar[middle] == n)
            {
                System.out.println(ar[middle]+ " is found at index: "+middle);
                System.exit(0);
            }
        }
        System.out.println(n+" is not in the array");
    }
}