package Class;
import java.util.Scanner;
class Loan
{
    int time;
    double principal, rate, interest, amt;
    
    void getdata()
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the principal amount, rate and time: ");
        principal = sc.nextDouble();
        rate = sc.nextDouble();
        time = sc.nextInt();
    }
    
    void calculate()
    {
        interest = (principal*rate*time)/100;
        amt = principal+interest;
    }
    
    void display()
    {
        System.out.println("The amount to be paid is: "+amt);
    }
    
    public static void main(String args[])
    {
        Loan ob = new Loan();
        ob.getdata();
        ob.calculate();
        ob.display();
    }
}