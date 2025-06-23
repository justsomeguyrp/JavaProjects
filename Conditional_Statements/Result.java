package Conditional_Statements;
import java.util.Scanner;
class Result{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = sc.nextInt();
        System.out.println("Enter your marks: ");
        double marks = sc.nextDouble();
        String res;
        if (grade >= 8){
            if (marks>=50){
                res = "Pass";
            }
            else{
                res = "Fail";
            }
        }
        else{
            if (marks>=35){
                res = "Pass";
            }
            else{
                res = "Fail";
            }
        }
        System.out.println(res);
    }
}