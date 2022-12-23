public class calcarea 
{
    public static void main(String args[]) 
    {
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle(50,100);
        R2.length = 50;
        R2.breadth = 100;
    }
    
}

class Rectangle
{
    double length;
    double breadth;
    static double area;
    Rectangle ()
    {
        length = 0;
        breadth = 0;
    }
    Rectangle(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
}