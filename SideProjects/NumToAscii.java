package SideProjects;
import java.util.Scanner;
class NumToAscii
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        
        int p = n, r;
        String f="";
        while(n>0)
        {
            r = n%100000;
            f += (char)r;
            n = n/100000;
        }
        System.out.println(f);
    }
}