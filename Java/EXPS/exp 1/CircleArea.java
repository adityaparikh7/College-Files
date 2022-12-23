import java.util.*;
public class CircleArea {
    public static void main(String[] args) 
    {
        double radius, area, circumference;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle:");
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
        System.out.println("Area of Circle : " + area);
        System.out.println("Circumference of Circle : " + circumference);
    }
}
