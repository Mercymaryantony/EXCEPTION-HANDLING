import java.util.*;
class user_exception extends Exception
{
    public user_exception(String message)
    {
        super(message);
    }
}
class password_exception extends Exception{
    public password_exception(String message)
    {
        super(message);
    }
}
public class prg1{
    public static void authenticate(String un,String pwd) throws user_exception,password_exception
    {
        if(un==null || pwd==null)
        {
            System.out.println("Username or password cannot be empty");
        }
        if(!un.equals("abc"))
        {
            throw new user_exception("Invalid username");
        }
        if(!pwd.equals("123"))
        {
            throw new password_exception("Invalid password");
        }
        System.out.println("Authentication successful");
    }
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the username and password");
        String username=s.next();
        String password=s.next();
        try
        {
            authenticate(username,password);
        }
        catch(user_exception | password_exception e)
        {
            System.out.println("Authentication fialed"+e.getMessage());
        }
    }
}