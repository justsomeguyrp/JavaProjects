package SideProjects;
import java.util.Scanner;

public class TextMessagingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== TEXT MESSAGING APP =====");

        // Get the message
        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        // Count words
        int wordCount = 0;

        // Count characters (no spaces)
        int charCount = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                charCount++;
            }
            else
             wordCount ++;
        }

        // Calculate cost
        double cost = charCount * 0.50;

        // Show details
        System.out.println("\n===== DETAILS =====");
        System.out.println("Message: " + message);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters (no spaces): " + charCount);
        System.out.println("Cost: ₹" + cost);

        System.out.println("\nChoose format:");
        System.out.println("1. UPPERCASE");
        System.out.println("2. lowercase");
        System.out.println("3. Title Case");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.close();

        String formatted;
        if (choice == 1) {
            formatted = message.toUpperCase();
        } else if (choice == 2) {
            formatted = message.toLowerCase();
        } else if (choice == 3) {
            formatted = toTitleCase(message);
        } else {
            formatted = message;
        }

        
        System.out.println("\n===== FORMATTED =====");
        System.out.println(formatted);
    }

    
    static String toTitleCase(String str) {
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
