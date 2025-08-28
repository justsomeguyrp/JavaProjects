package StringHandling;
import java.util.Scanner;
class Lab_TriangleAndInvertedTriangle
{
    static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 for triangle and 2 for inverted triangle: ");
        int ch = sc.nextInt();
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        String str = "ABCDE";
        
        switch(ch)
        {
            case 1:
                for(int i=n; i>=0; i--)
                {
                    System.out.println(str.substring(0,i));
                }
                break;
            case 2:
                for(int i=0; i<=n; i++)
                {
                    for(int j=n-i; j<n; j++)
                        System.out.print(" ");
                    System.out.println(str.substring(i, n));
                }
        }
    }
}