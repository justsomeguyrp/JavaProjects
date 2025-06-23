package Introduction;
import java.util.Scanner;
class Speed{
    public static void main(){
        Scanner obj = new Scanner(System.in);
        double distance = obj.nextDouble();
        double time = obj.nextDouble();
        double speed = distance/time;
        speed *= 5/18.0;
        System.out.println(speed);
    }
}