package LibraryClasses;
import java.util.Scanner;
class IntegerSetToString
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 integers: ");
        int sum=0, prod=1, n;
        for(int i=1; i<=10; i++)
        {
            n = sc.nextInt();
            sum += n;
            prod*=n;
        }
        String s1 = Integer.toString(sum);
        String s2 = Integer.toString(prod);
        String conc = s1+s2;
        System.out.println("The concatenated string is: "+conc);
    }
}