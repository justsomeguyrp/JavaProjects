import java.util.Scanner;
class TotalSeconds
{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        Q.print("Enter the hours: ");
        int hours = obj.nextInt();
        Q.print("Enter the minutes: ");
        int minutes = obj.nextInt();
        Q.print("Enter the seconds");
        int seconds = obj.nextInt();
        seconds += minutes*60;
        seconds += hours*60*60;
        System.out.println(seconds);

    }
}