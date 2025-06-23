public class Q
{
    public static void print(String x)
    {
        System.out.println(x);
    }
    public static void print(int x)
    {
        System.out.println(x);
    }
    public static void print(double x){
        System.out.println(x);
    }
    public static boolean isVowel(char ch){
        switch(ch)
        {
            case 'A': case 'E': case 'I': case 'O': case 'U':case 'a': case 'e': case 'i': case 'o': case 'u':
            return true;
            
            default:
                return false;
            
        }
    }
}