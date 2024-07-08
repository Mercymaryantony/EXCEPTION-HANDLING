import java.util.*;
class negative_exception extends Exception
{
    public negative_exception(String message)
    {
        super(message);
    }
}
public class average{
    public static void authenticate(int number)throws negative_exception{
        if(number<0)
        {
            throw new negative_exception("Negative number");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers");
        int n=sc.nextInt();
        int count=0,sum=0,i;
        double avg;
        for (i=0;i<n;i++)
        {
            try{
                System.out.println("Enter the number");
                int num=sc.nextInt();
                if(num>=0)
                {
                    sum=sum+num;
                    count++;
                }
                else{
                    n++;
                    authenticate(num); 
                }
            }
            catch(negative_exception e)
            {
                System.out.println("Error:"+e.getMessage());
            }
        }
        avg=sum/count;
        System.out.println("The average is "+avg);
    }
}

