package Array;
import java.util.Scanner;
class DiagonalMatrix
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];
        
        //Input:
        for(int r=0; r<4; r++)
        {
            for(int c=0; c<4; c++)
            {
                System.out.println("Enter element for row "+(r+1)+" column " + (c+1)+": ");
                a[r][c] = sc.nextInt();
            }
        }
        int s1=0, s2=0;
        
        for(int r=0; r<4; r++)
        {
            s1 += a[r][r];
            s2 += a[r][3-r];
            
            
        }
        
        if(s1 == s2)
            System.out.println("Array is diagonal array");
        else
            System.out.println("Array is not diagonal");
    }
}