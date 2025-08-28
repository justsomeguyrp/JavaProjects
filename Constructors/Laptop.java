package Constructors;
import java.util.Scanner;
class Laptop
{
    String name;
    double dis, price, amt;
    
    Laptop(String n, double p)
    {
        name = n;
        price = p;
        dis = 0;
    }
    
    void cal()
    {
        if(price <= 25000)
            dis = 5;
        else if(price <=50000)
            dis = 7.5;
        else if(price <= 100000)
            dis = 10;
        else
            dis = 15;
        amt = price - (dis/100)*price;
    }
    
    void display()
    {
        System.out.println("Name\tDiscount\tAmount To Be Paid");
        System.out.println(name+"\t"+dis+"\t"+amt); 
    }
}