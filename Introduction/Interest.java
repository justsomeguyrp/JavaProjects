package Introduction;
import java.util.Scanner;
class Interest
{
    
    public static void main(String[] args){
    Scanner obj = new Scanner(System.in);
    int principal = obj.nextInt();
    double rate = obj.nextDouble();
    double time = obj.nextDouble();
    double x = principal*rate*time/100;
    System.out.println("Interest is: "+ x);
}
}