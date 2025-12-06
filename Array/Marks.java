package Array;
import java.util.Scanner;
class Marks
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int roll[] = new int[100];
        String name[] = new String[100];
        double marks[][] = new double[100][6];
        double total, perc=0;
        char grade;
        for(int i=0; i<100; i++)
        {
            System.out.println("Enter name and roll number for student "+(i+1)+": ");
            name[i] = sc.next();
            roll[i] = sc.nextInt();
            for(int j=0; j<6; j++)
            {
                System.out.println("Enter marks of subject "+(j+1));
                marks[i][j] = sc.nextDouble();
            }
        }
        
        
        for(int r=0; r<100; r++)
        {
            total = 0;
            for(int c=0; c<6; c++)
            {
                total += marks[r][c];
            }
            perc = total/6;
        }
        
        if(perc>=80)
            grade = 'A';
        else if(perc>=60)
            grade = 'B';
        else if(perc>=40)
            grade = 'C';
        else
            grade = 'D';
        
        System.out.println("Percentage is: "+perc);
        System.out.println("Grade is: "+grade);
    }
}