package Introduction;
import java.util.Scanner;
class OperationsOnNumber
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println("Natural logarithm is: "+Math.log(n));
        System.out.println("Absolute value is: "+Math.abs(n));
        System.out.println("Square root is: "+Math.sqrt(n));
        System.out.println("Cube is: "+Math.pow(n,3));
        System.out.println("Random number is: "+Math.random());
    }
}