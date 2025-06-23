package Introduction;
public class Improved
{
    public static double random(double Lowest,double Highest){
        double a = Lowest;
        double b = Highest;
        
        String x = Double.toString(a);
        int lena = x.length();
        String y = Double.toString(b);
        int lenb = y.length();
        if (lena == lenb){
            lenb ++;
        }
        while(true){
            double c = Math.random();
            double m = c*Math.pow(10,lena);
            double n = c*Math.pow(10,lenb-1);
            if (m >= a && n <= b){
                c *= Math.pow(10,lena);
                return c;
            }
        }
    }
    public static int randomInt(double lowest, double highest){
        double a = random(lowest,highest);
        int b = (int)a;
        return(b);
    }
    
    public static double round(double NumberToRound, int RoundToDecimalPlace){
        double a = NumberToRound * Math.pow(10,RoundToDecimalPlace);
        double b = Math.round(a);
        double c = b/Math.pow(10, RoundToDecimalPlace);
        return c;
    }
}