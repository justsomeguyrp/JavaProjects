package Conditional_Statements;
import java.util.Scanner;
class Kumar
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of policy holder: ");
        String name = sc.next();
        System.out.println("Enter sum assured: ");
        double sum = sc.nextDouble();
        System.out.println("Enter annual premium: ");
        double premium = sc.nextDouble();
        
        if(sum < 100000){
            sum += (5/100.0)*sum;
            premium += (2/100.0)*premium;
        }
        else if(sum < 200000){
            sum += (8/100.0)*sum;
            premium += (3/100.0)*premium;
        }
        else if(sum < 500000){
            sum += (10/100.0)*sum;
            premium += (5/100.0)*premium;
        }
        else{
            sum += (15/100.0)*sum;
            premium += (7.5/100)*sum; 
        }
        
        System.out.println("Sum assured: "+sum);
        System.out.println("First annual premium is: "+premium);
    }
}