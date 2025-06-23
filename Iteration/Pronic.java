package Iteration;
import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n/2; i++)
        {
            if(i*(i+1) == n){
                System.out.println(n+" is pronic");
                System.exit(0);
            }
        }
        System.out.println(n+" is not pronic");
    }
}