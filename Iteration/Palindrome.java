package Iteration;
import java.util.Scanner;
class Palindrome
{
    static void main(int n)
    {
        int p=n, r, rev=0;
        while(n>0)
        {
            r = n%10;
            rev = rev*10+r;
            n /= 10;
        }
        if(p==rev)
            System.out.println(p+" is a palindrome");
        else
            System.out.println(p+" is not a palindrome");
        
    }
}
