import java.util.Scanner;
class Problem9{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        double mark1 = obj.nextDouble();
        double mark2 = obj.nextDouble();
        double mark3 = obj.nextDouble();
        double total = mark1 + mark2 + mark3;
        double percentage = total/3;
        System.out.println("Total is "+total+" Percentage is "+percentage); 
    }
}