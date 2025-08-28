package Constructors;
import java.util.Scanner;
class BookFair
{
    String bname;
    double price;
    
    BookFair()
    {
        bname = "";
        price = 0;
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and price of the book: ");
    }
}