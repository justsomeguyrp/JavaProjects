package StringHandling;

class Initials
{
    static void main()
    {
        String str = "adsj kdkasdj askdj";
        int last_space = str.lastIndexOf(' ');
        String last_word = str.substring(last_space);
        String remaining = str.substring(0, last_space);
        System.out.println(remaining+last_word);
    }
}