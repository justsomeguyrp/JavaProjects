package Introduction;
public class Swap
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        int num1 = 2;
        int num2 = 3;
        int temp = 0;
        System.out.println("Number1: "+num1+" Number 2"+num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number1: "+num1+" Number 2"+num2);
    }
}
