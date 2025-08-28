import java.util.Scanner;
class StringHandlingAT
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); // to declare the scanner to take input
        System.out.println("Enter your message: ");
        String str = sc.nextLine(), word = "";
        char ch;
        str = str.trim(); //trims the string to prevent unneccesary whitespaces
        str += " ";
        int word_ct=0, char_ct=0; //declares word and character count
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                if(i!=str.length()-1) //to check if i is the last character of the string
                {
                    if(str.charAt(i+1) != ' ')
                        word_ct ++;
                }
                else
                    word_ct++;
            }
            else
            {
                char_ct++;
            }
        }
        double cost_msg = char_ct * 0.5;
        System.out.println("Number of words: "+word_ct);
        System.out.println("Number of characters: "+char_ct);
        System.out.println("Cost of message: "+cost_msg);
        System.out.println("To format the message: \nEnter 1 for converting it to uppercase \nEnter 2 for converting it to lowercase\nEnter 3 for converting it to title case");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println(str.toUpperCase()); //converts string to the uppercase
                break;
            case 2:
                System.out.println(str.toLowerCase()); //converts string to the lowercase
                break;
            case 3:
                System.out.println(titleCase(str)); //converts the first letter of each word to uppercase
                break;
            default:
                System.out.println("Invalid choice"); //a suitable message if none of the options are selected
        }
    }
    
    static String titleCase(String str)
    {
        char ch;
        str = str.trim();
        str = " "+str;
        String newStr = "";
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch) && str.charAt(i+1) != ' ')
            {
                newStr += " ";
                newStr += Character.toUpperCase(str.charAt(i+1));
                i++;
            }
            else
                newStr += Character.toLowerCase(ch);
        }
        newStr = newStr.trim();
        return newStr;
    }
}