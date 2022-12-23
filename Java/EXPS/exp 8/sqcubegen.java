import java.util.*;

class number extends Thread 
{
    public void run() 
    {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInteger = random.nextInt(1000);
            System.out.println("The Random Integer generated is: " + randomInteger);
            if(randomInteger %2==0)
            {
                square s = new square(randomInteger);
                s.start();
            }
            else
            {
                cube c = new cube(randomInteger);
                c.start();
            }
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                System.out.println(ex);
            }
        }
    }
}

class square extends Thread 
{
    int x;

    square(int n) 
    {
        x = n;
    }

    public void run() 
    {
        int sqr = x * x;
        System.out.println("Square of random integer" + x + " = " + sqr);
    }
}

class cube extends Thread 
{
    int x;

    cube(int n) 
    {
        x = n;
    }

    public void run() 
    {
        int cub = x * x * x;
        System.out.println("Cube of random integer" + x + " = " + cub);
    }
}

class sqcubegen 
{
    public static void main(String[] args) 
    {
        number n = new number();
        n.start();
    }
}