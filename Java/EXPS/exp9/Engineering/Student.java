package Engineering;
import java.util.*;

public class Student 
{
        String name;
        int roll_no;
        int marks;
        int ITVC;
        int OOPM;
        int DS;
        int COA;
        public Object student_details;
        public int totalMarks;
    
        Student(){}
    
        public Student(String name, int roll_no,int OOPM,int DS,int COA,int ITVC)
        {
            this.name = name;
            this.roll_no = roll_no;
            this.ITVC = ITVC;
            this.OOPM = OOPM;
            this.DS = DS;
            this.COA = COA;
            this.totalMarks = OOPM + DS + COA + ITVC;
        }
    
        public static Student[] create()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            int n = sc.nextInt();
            Student[] s = new Student[n];
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter the name of the student: ");
                String name = sc.next();
                System.out.println("Enter the roll number of the student: ");
                int roll_no = sc.nextInt();
                System.out.println("Enter the marks of ITVC: ");
                int ITVC = sc.nextInt();
                System.out.println("Enter the marks of OOPM: ");
                int OOPM = sc.nextInt();
                System.out.println("Enter the marks of DS: ");
                int DS = sc.nextInt();
                System.out.println("Enter the marks of COA: ");
                int COA = sc.nextInt();
                s[i] = new Student(name,roll_no,OOPM,DS,COA,ITVC);
            }   
            return s;
        }
}


