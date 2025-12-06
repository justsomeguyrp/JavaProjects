
 
import java.util.Scanner;
class Password
{
    static void main()
    {
        String str = "&&ilovevimalsdick";
        char c;
        int cntU=0, cntL=0, cntD=0, cntS=0;
        
        for(int i=0; i<str.length(); i++)
        {
            c = str.charAt(i);
            if(Character.isUpperCase(c))
                cntU++;
            else if(Character.isLowerCase(c))
                cntL++;
            else if(Character.isDigit(c))
                cntD++;
            else
                {
                    for(int j= 'A'; j <= 'Z'; j++)
                    {
                        if(c!=j)
                        {
                            if(Character.isDigit(c))
                            {
                                break;
                                }
                            else
                            cntS++;
                        }
                    }
                }
        }
        System.out.println(cntU);
        System.out.println(cntL);
        System.out.println(cntD);
        System.out.println(cntS);
        if(cntU>=4 && cntL >=4 && cntD >=2 && cntS >=2)
            System.out.println("GOOD");
        else
            System.out.println("BAD");
    }
}
