package Conditional_Statements;
class GradeCalc
{
    public static String main(double marks)
    {
       String res;
       
       if(marks>=90)
       {
           res = "A+";
       }
       else if(marks>=80)
       {
           res = "A";
       }
       else if(marks>=70)
       {
           res = "B+";
       }
       else if(marks>=60)
       {
           res = "B";
       }
       else
       {
           res = "F";
       }
       return(res);
    }
    
}