package Class;
import java.util.Scanner;
class Honda
{
    int type, cost;
    double amt;
    void gettype()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of the engine: ");
        type = sc.nextInt();
        System.out.println("Enter the previous cost: ");
        cost = sc.nextInt();
    }
    void find()
    {
        if(type == 2)
            amt = cost + (10/100.0)*cost;
        else if(type == 4)
            amt = cost + (12/100.0)*cost;
        else
        {
            System.out.println("Wrong input");
            System.exit(0);
        }            
    }
    void printcost()
    {
        System.out.println("Type is: "+type+" and the new cost is: "+amt);
    }

    public static void main(String args[])
    {
        Honda ob = new Honda();
        ob.gettype();
        ob.find();
        ob.printcost();
    }
}