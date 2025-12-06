import java.util.*;
class check_palindrome
{
    public static void main(String args[])
    {
        String s="MOM AND DAD ARE NOT AT HOME ",S="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            String rev="";
            if(c==' ')
            {
                for (int j = (S.length() - 1); j >=0; j--) 
                {
                    rev+= S.charAt(j);
                }
                
                if(rev.equals(S))
                {
                     System.out.println(S);
                }

                S="";
            }
            else
            {
                S=S+c;
            }
        }
    }
}
