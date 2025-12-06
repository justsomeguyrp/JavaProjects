package Array;
import java.util.Scanner;
class Transpose
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int[4][4];
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.println("Enter for row "+i+" and column "+j+": ");
                ar[i][j] = sc.nextInt();
            }
        }
        for(int r=0; r<4; r++)
        {
            for(int c=0; c<4; c++)
                System.out.print(ar[r][c]+" ");
            System.out.println();  
        }
        System.out.println();
        int temp;   
        for(int r=0; r<4; r++)
        {
            for(int c=0; c<4; c++)
            {
                temp = ar[r][c];
                ar[r][c] = ar[c][r];
                ar[c][r] = temp;
            }
            
        }
        for(int r=0; r<4; r++)
        {
            for(int c=0; c<4; c++)
                System.out.print(ar[r][c]+" ");
            System.out.println();  
        }
    }
}