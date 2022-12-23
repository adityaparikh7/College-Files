import java.util.*;

class vector {
    public static void main(String[] args) {
        int choice, n, id;
        double salary;
        String name;
        Scanner sc = new Scanner(System.in);
        Vector<employee> v = new Vector<employee>();
        while (true) {
            System.out.println("1.Add employee");
            System.out.println("2.Add employee according to salary");
            System.out.println("3.Remove employee by name");
            System.out.println("4.Remove employee by id");
            System.out.println("5.Display all employees");
            System.out.println("6.Exit");
            System.out.println("\nEnter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the number of employees: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter employee details");
                        System.out.println("Enter the name of employee: ");
                        name = sc.next();
                        System.out.println("Enter the id of employee: ");
                        id = sc.nextInt();
                        System.out.println("Enter the salary of employee: ");
                        salary = sc.nextDouble();
                        employee e = new employee(name, id, salary);
                        v.add(e);
                    }
                    break;

                case 2:
                    System.out.println("Enter the name of employee: ");
                    name = sc.next();
                    System.out.println("Enter the id of employee: ");
                    id = sc.nextInt();
                    System.out.println("Enter the salary of employee: ");
                    salary = sc.nextDouble();
                    for (int i = 0; i < v.size(); i++) {
                        if (v.get(i).salary > salary) {
                            employee e = new employee(name, id, salary);
                            v.add(i, e);
                            break;
                        }
                    }
                    break;

                case 3:
                    int a = 0;
                    System.out.println("Enter employee name to be removed: ");
                    name = sc.next();
                    for (int i = 0; i < v.size(); i++) {
                        if (v.get(i).name.equals(name)) {
                            v.remove(i);
                            a = 1;
                            break;
                        }
                    }
                    if (a == 0) {
                        System.out.println("Employee not found");
                    }
                    break;

                case 4:
                    int b = 0;
                    System.out.println("Enter employee id to be removed: ");
                    id = sc.nextInt();
                    for (int i = 0; i < v.size(); i++) {
                        if (v.get(i).id == id) {
                            v.remove(i);
                            b = 1;
                            break;
                        }
                    }
                    if (b == 0) {
                        System.out.println("Employee not found");
                    }
                    break;

                case 5:
                    for (int i = 0; i < v.size(); i++) {
                        System.out.println("Employee " + (i + 1) + " details: ");
                        System.out.println("Name: " + v.get(i).name);
                        System.out.println("ID: " + v.get(i).id);
                        System.out.println("Salary: " + v.get(i).salary);
                    }
                    break;

                case 6:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
            }
        }
    }
}

class employee {
    public String name;
    public int id;
    public double salary;

    employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class sortBySalary implements Comparator<employee> {
    public int compare(employee a, employee b) {
        if (a.salary > b.salary)
            return 1;
        else if (a.salary < b.salary)
            return -1;
        else
            return 0;
    }
}

// class sortid implements Comparator<employee>
// {
// public int compare(employee a, employee b)
// {
// if(a.id>b.id)
// return 1;
// else if(a.id<b.id)
// return -1;
// else
// return 0;
// }
// }

// class sortname implements Comparator<employee>
// {
// public int compare(employee a, employee b)
// {
// return a.name.compareTo(b.name);
// }
// }
