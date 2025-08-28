package StringHandling;

class Longest
{
    static void main()
    {
        String str = "12 123456 1234567";
        str = str.trim();
        str += " "; // to compensate for the length value count, including a whitespace
        int prv=0, num_longest=0;
        String longest="", sub;
        char ch;
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                sub = str.substring(prv, i);
                if(i-prv > num_longest)
                {
                    num_longest = i-prv;
                    longest = sub;
                    System.out.println(longest + "\t"+ num_longest);
                }
                prv = i+1;
            }
        }
        System.out.println(longest + "\t"+ num_longest);
    }
}