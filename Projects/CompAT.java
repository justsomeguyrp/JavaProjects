package Projects;
import java.util.Scanner;

class CompAT
{
    static void display(String menu_name[], int menu_price[]) //function to display the menu
    {
        System.out.println("**********Welcome to the Indian Tiffin counter!**********"); 
        System.out.println("Item number\tItem name\tItem price");
        for(int i=0; i<menu_name.length; i++)
        {
            System.out.println((i+1)+"\t\t"+menu_name[i]+"\t\t"+menu_price[i]); //displaying the menu
        }
        
    }
    public static void main(String[] args)
    {
        char exit = 'n';
        Scanner sc= new Scanner(System.in); //creation of the scanner object
        int total = 0;
        int menu_price[] = {425, 450, 325, 90, 100, 480, 275}; //predefined dish price array
        String menu_name[] = {"Biryani", "Pasta", "Chapati", "Roti", "Fries", "Sushi", "Noodles"}; //predefined dish name array
        
        display(menu_name, menu_price);
        
        do //the repeated loop of changing the order, 
        {                     
            System.out.println("Enter 'd' to display the menu, 'c' to calculate the bill amount, 'o' to order and 'e' to exit");
            exit = sc.next().charAt(0);
            if(exit == 'c') //printing the calculated total amount
            {
                System.out.println("The total price is: "+total);
            }
            
            else if(exit == 'o') //ordering of the menu
            {
                    System.out.println("Enter the item number: ");
                    int item = sc.nextInt(), price, plates=1;
                    if(item > menu_name.length)
                    {
                        System.out.println("Invalid item number!");
                        continue;
                    }
                    System.out.println("Enter number of plates: ");
                    plates = sc.nextInt(); //gets number of plates
                    price = menu_price[item-1];
                    price *= plates;
                    total += price;
                
            }
            else if(exit == 'd')
            {
                display(menu_name, menu_price); //displays the menu
            }
        }while(exit!='e');
        sc.close(); //closes the scanner object
        System.out.println("Successfully exiting the program!"); //ends the program with an error message
    }
}
