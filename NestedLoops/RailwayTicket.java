package NestedLoops;
import java.util.Scanner;

/**
 * Write a description of class RailwayTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RailwayTicket
{
    String name, coach;
    long mob_no;
    int amt, totalamt;
    
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, coach, mobile number and amount: ");
        name = sc.nextLine();
        coach = sc.nextLine();
        mob_no = sc.nextLong();
        amt = sc.nextInt();
    }
    void update()
    {
        
    }
}