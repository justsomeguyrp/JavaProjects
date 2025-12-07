package Constructors;
import java.util.Scanner;
class FruitJuice
{
    String flavor, pack_type;
    int pack_size, product_price, product_code;
    
    FruitJuice()
    {
        product_code = 0;
        flavor = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product code, flavour, pack type, pack size and product price: ");
        product_code = sc.nextInt();
        flavor = sc.next();
        pack_type = sc.next();
        pack_size = sc.nextInt();
        product_price = sc.nextInt();
    }
    void discount()
    {
        product_price -= 10;
    }
    void display()
    {
        System.out.println("Product Code \t Flavor \t Pack Type \t Pack Size \t Product Price");
        System.out.println(product_code + "\t" + flavor + "\t" + pack_type + "\t" + pack_size + "\t" + product_price);
    }
    
    public static void main(String args[])
    {
        FruitJuice ob = new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}