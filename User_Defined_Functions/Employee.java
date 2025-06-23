package User_Defined_Functions;
import java.util.Scanner;
class Employee
{
    static void Tax(String name, int income)
    {
        double tax = 0;
        if(income <= 250000)
            tax=0;
        else if(income <=500000)
            tax = 10/100.0 * (income-250000);
        else if(income <=1000000)
            tax = 30000 + 20/100.0*(income-500000);
        else
            tax = 50000+30/100.0*(income-1000000);
        System.out.println(name+", your income tax is: "+tax);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your income: ");
        int income = sc.nextInt();
        Tax(name, income);
    }
}