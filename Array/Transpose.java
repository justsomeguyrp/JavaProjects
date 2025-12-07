package Array;
import java.util.Scanner;
class Transpose
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int[4][4];
        
        //Input:
        for(int r=0; r<4; r++) //r is row
        {
            for(int c=0; c<4; c++) // c is column
            {
                System.out.println("Enter for row "+(r+1)+" and column "+(c+1)+": "); //r+1 is used to indicate that the row is first row and next, not 0th row, which doesnt sound nice
                ar[r][c] = sc.nextInt();
            }
        }
        
        //Initial array printed: (Optional)
        for(int r=0; r<4; r++)
        {
            for(int c=0; c<4; c++)
                System.out.print(ar[r][c]+" ");
            System.out.println();  
        }
        System.out.println();
        
        int temp; 
        //Process: (Main Logic)
        for(int r=0; r<4; r++)
        {
            for(int c=0; c<4; c++)
            {
                //Simple replacing of elements using temp
                temp = ar[r][c];
                ar[r][c] = ar[c][r];
                ar[c][r] = temp;
                
            }
            
        }
        
        //Final output, with transposed matrix
        for(int r=0; r<4; r++)
        {
            for(int c=0; c<4; c++)
                System.out.print(ar[r][c]+" ");
            System.out.println();  
        }
    }
}