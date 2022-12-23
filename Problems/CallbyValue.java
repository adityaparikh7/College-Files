public class CallbyValue 
{
    static void swap(int a , int b)
    {
        // System.out.println(a+" "+b);
        int c = a;
        a = b;
        b = c;
        // System.out.println(a+" "+b);
    }
    static void swap(modify a)
    {
        int c = a.a;
        a.a = a.b;
        a.b = c;

    }

    public static void main(String args[]) 
    {
        int a = 45;
        int b = 30;
        // System.out.println(a+" "+b);
        // swap(a,b);
        // System.out.println(a+" "+b);
        modify c = new modify(a,b);
        System.out.println(c.a+", "+c.b);
        swap(c);
        System.out.println(c.a+", "+c.b);

    }
    


}

class modify
{
    static int a,b;
    modify(int c , int d)
    {
        a=c;
        b=d;
    }
}