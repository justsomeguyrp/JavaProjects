package Introduction;
import java.util.Scanner;
class TrueMiniCalc{
    public static void main(int a, int b, char operator){
    while(true){
        long sum = a + b;
        long diff = a-b;
        long prod = a*b;
        long quo = a/b;
        
        if (operator == '+'){
            System.out.println("Sum is: "+sum);
        }
        else if (operator == '-'){
            System.out.println("Differance is: "+ diff);
        }
        else if (operator == '*'){
            System.out.println("Product is: "+prod);
        }
        else if (operator == '/'){
            System.out.println("Quotient is: "+quo);
        }
        else{
            System.out.println("Sum is: "+sum);
            System.out.println("Differance is: "+ diff);
            System.out.println("Product is: "+prod);
            System.out.println("Quotient is: "+quo);
        }
     
    }
    }
}