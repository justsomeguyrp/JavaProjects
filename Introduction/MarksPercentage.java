package Introduction;
import java.util.Scanner;
public class MarksPercentage
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        double marks = obj.nextDouble();
        double perc = (marks/1000)*100;
        System.out.println(perc);
        
    }
}
