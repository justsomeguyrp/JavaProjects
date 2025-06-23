package Introduction;
import java.util.Scanner;
class Hypotenuse{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        double p = sc.nextDouble();
        System.out.println("Answer is: "+Math.sqrt(p*p+b*b));
    }
    
}