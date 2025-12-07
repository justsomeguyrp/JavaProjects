import java.util.Scanner;

/*
 * WAP to input words for an array of size 10 and first sort it in bubble sort
 * Then binary search an element
 * Then, find the longest and shortest word in selected string
 * Finally, randomize the array and display it
 */

class Everything
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String ar[] = new String[10];
        System.out.println("Enter 10 elements: ");
        for(int i=0; i<10; i++)
        {
            ar[i]= sc.next();
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(ar[i]);
        }
        System.out.println("Enter a element: ");
        String s = sc.next(), temp;
        
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<9-i; j++)
            {
                if(ar[j].compareToIgnoreCase(ar[j+1])> 0)
                {
                    temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        for(int i=0; i<10; i++)
            System.out.println(ar[i]);
        
        int l=0, h=9, m;
        
        while(l<=h)
        {
            m = (l+h)/2;
            
            if(ar[m].compareToIgnoreCase(s) < 0)
                l = m+1;
            
            else if(ar[m].compareToIgnoreCase(s) > 0)
                h = m-1;
            else
            {
                System.out.println("The desired element: "+s+" is at index "+m);
                break;
            }
        }
        
        s = s+" ";
        String longest="", shortest="", word="";
        char c;
        for(int i=0; i<s.length(); i++)
        {
            c = s.charAt(0);
            if(Character.isWhitespace(c))
            {
                if(word.length() < shortest.length())
                    shortest = word;
                if(word.length() > longest.length())
                    longest = word;
                word = "";
            }
            else
            {
                word += c;
            }
        }
        System.out.println("Longest word is: "+longest + "\nShortest word is: "+shortest);
    }
}