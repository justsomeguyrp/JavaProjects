package Introduction;
public class ReverseInt{
    public static int main(int n){
       int rev = 0;
       int r;
       while(n>0){
           r = n%10;
           rev = rev*10+r;
           n/=10;
       }
       return rev;
    }
}