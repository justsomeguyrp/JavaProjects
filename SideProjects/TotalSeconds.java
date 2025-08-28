package SideProjects;
import java.util.Scanner;
class TotalSeconds
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the hours: ");
        int hours = obj.nextInt();
        System.out.println("Enter the minutes: ");
        int minutes = obj.nextInt();
        System.out.println("Enter the seconds");
        int seconds = obj.nextInt();
        seconds += minutes*60;
        seconds += hours*60*60;
        System.out.println(seconds);

    }
}