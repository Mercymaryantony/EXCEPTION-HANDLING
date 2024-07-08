import java.util.*;
class negative_exception extends Exception{
    public negative_exception(String message)
    {
        super(message);
    }
}
public class prg2
{
    public static void main(String args[])throws negative_exception
    {
        Scanner s= new Scanner(System.in);
        int sum=0,count =0;
        double avg;
        System.out.println("Enter the number of integers:");
        int n=s.nextInt();
        for (int i=0;i<n;i++)
        {
            try{
            
                System.out.println ("Enter the number:");
                int num=s.nextInt();
                if(num>=0)
                {
                    sum=sum+num;
                    count++;
                }
                else{
                    n++;
                    throw new negative_exception("Negative number");
                    
                }
            
             
            
            }
            catch(negative_exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        }
         avg=sum/count;
            System.out.println("The average is ="+avg);
        
       
    }
}