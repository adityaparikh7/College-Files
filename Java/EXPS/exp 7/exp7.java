import java.util.*;

class TimeException extends Exception
{
    TimeException(){}
    @Override
    public String toString()
    {
        return "Time is greater than 60 seconds";
    }
}

public class exp7 
{
    public static void time(int min, int sec) throws Exception
    {
        if(sec>60)
        {
            throw new TimeException();
        }
        else
        {
            int time = min * 60 + sec;
            System.out.println("Total time in seconds: " + time);
        }
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int min = sc.nextInt();
        System.out.println("Enter seconds: ");
        int sec = sc.nextInt();
        try
        {
            time(min, sec);
        }
        catch(TimeException e)
        {
            System.out.println(e);
        }
        sc.close();
    }
}


