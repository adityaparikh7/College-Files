import java.util.*;
 
public class sortfunction
{
    public static void main(String[] args)
    {
       
        Vector<String> al = new Vector<String>();
        al.add("Geeta");
        al.add("Is");
        al.add("A");
        al.add("Nice");
        al.add("Friend");

        Collections.sort(al);

        System.out.println("Vector after the use of" +
                           " Collection.sort() :\n" + al);
  Collections.sort(al, Collections.reverseOrder());
System.out.println("Vector after the use of reverse order" +
                           " Collection.sort() :\n" + al);
    }
}