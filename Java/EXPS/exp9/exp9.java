import Engineering.*;


public class exp9 {
    public static void main(String[] args) 
    {
        Student[] s = Student.create();
        marks m = new marks(s.length);
        m.students = s;
        marks.sort(m.students);
        m.display();
    }
}


// import java.util.*;
 // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of students: ");
        // int n = sc.nextInt();
        // Student[] s = new Student[n];
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println("Enter the name of the student: ");
        //     String name = sc.next();
        //     System.out.println("Enter the roll number of the student: ");
        //     int roll_no = sc.nextInt();
        //     System.out.println("Enter the marks of the student: ");
        //     int marks = sc.nextInt();
        //     System.out.println("Enter the marks of OOPM: ");
        //     int OOPM = sc.nextInt();
        //     System.out.println("Enter the marks of DS: ");
        //     int DS = sc.nextInt();
        //     System.out.println("Enter the marks of COA: ");
        //     int COA = sc.nextInt();
        //     s[i] = new Student(name,roll_no,marks,OOPM,DS,COA);
        // }