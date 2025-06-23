package Iteration;
import java.util.Scanner;
class Monkey
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the pole: ");
        int totalHeight = sc.nextInt();
        int height=5, i=1, heightLoss;
        for(; height<=totalHeight; i++)
        {
            heightLoss = (int)(2/100.0*height)- height;
            height -= (2/100.0)*heightLoss;
            height += heightLoss;
        }
        System.out.println("Attempts: "+i);
    }
}
