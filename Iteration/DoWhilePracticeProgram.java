package Iteration;
import java.util.Scanner;
class DoWhilePracticeProgram
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int m,n, sumO, sumE;
        System.out.println("Enter 2 numbers where first number is lesser than second");
        do{
        m = sc.nextInt();
        n = sc.nextInt();
        }while(m>=n);

    }
}
