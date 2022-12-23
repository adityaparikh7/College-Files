import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Ferrari");
        cars.add("Mercedes");
        cars.add("McLaren");
        cars.add("Alpine");
        cars.add("Alfa Romeo");
        cars.add("Aston Martin");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        // System.out.println("Delete a car: ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // cars.remove(n);
        // System.out.println(cars);
       
        System.out.println("Before Sorting: " + cars);
        Collections.sort(cars);
        System.out.println("After Sorting: " + cars);
        Collections.reverse(cars);
        System.out.println("After reversing: " + cars);

    }
}


//arraylist sorting in java?
// Collections.sort(testList);
// Collections.reverse(testList);


