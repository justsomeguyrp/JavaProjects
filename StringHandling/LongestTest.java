package StringHandling;

class LongestTest //hardest version
{
    static void main()
    {
        String str = "12 123456 1234567";
        str = str.trim();
        int prv=0, num_longest=0;
        String longest="", sub;
        char ch;
        int prevStrLength = 0;
        for(int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                sub = str.substring(prv, i);
                prevStrLength = sub.length();
                if(i-prv >= num_longest)
                {
                    longest = sub;
                    num_longest = i-prv;
                    System.out.println(longest + "|\t"+ num_longest);
                }
                prv = i+1;
            } else if(i == str.length()-1) {
                sub = str.substring(prv, i+1);
                if(prevStrLength < sub.length()) {
                    longest = sub;
                    num_longest = sub.length();
                    System.out.println("LAST: "+longest + "|\t"+ num_longest);
                }
            }
        }
        System.out.println(longest + "|\t"+ num_longest);
    }
}