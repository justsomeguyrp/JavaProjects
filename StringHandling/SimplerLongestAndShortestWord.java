package StringHandling;

class SimplerLongestAndShortestWord
{
    public static void main(String args[])
    {
        String s = "HELLO WORLD AS ASBFDHASBDJHASBJD";
        s = s.trim();
        s = s+" ";
        String longest="", shortest=s, word="";
        char c;
        for(int i=0; i<s.length(); i++)
        {
            c = s.charAt(i);
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
        System.out.println("The longest word is "+longest+" with length "+longest.length());
        System.out.println("The shortest word is "+shortest+" with length "+shortest.length());
    }
}
