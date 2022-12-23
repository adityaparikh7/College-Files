import java.util.*;

public class accounts 
{
    public int id;
    public String name;
    public float balance;
    static accounts acc[];
    static int n;
    static int count = 0;

    public static void add()
    {
        Scanner sc = new Scanner(System.in);
        accounts add_acc = new accounts();
        System.out.println("Enter the account ID: ");
        add_acc.id = sc.nextInt();
        for (int i = 0; i < count; i++) 
        {
            while(add_acc.id == acc[i].id) 
            {
                System.out.println("Enter the account id: ");
                add_acc.id = sc.nextInt(); 
            }
        }
        System.out.println("Enter name of account holder: ");
        add_acc.name = sc.next();
        System.out.println("Enter balance of account: ");
        add_acc.balance = sc.nextFloat();
        acc[count++] = add_acc;
        System.out.println("Account added");
    }

    public static void delete() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account ID: ");
        int account_id = sc.nextInt();
        int delete_index = -1;
        for (int i = 0; i < acc.length; i++) {
            if (acc[i].id == account_id) {
                delete_index = i;
				break;
            }
        }           
		if (delete_index == -1) {
			System.out.println("Account not present");
		}
		else {
            System.out.println("Account deleted");
            for (int i = delete_index + 1; i < acc.length; i++){
                acc[i - 1] = acc[i];  
        }
		count --;
		}
    }

    public static void display()
    {
        System.out.println("Account ID\tAcc. Holder Name\tBalance");

        int n=acc.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(acc[i].balance<acc[j].balance)
                {
                    float temp = acc[j].balance;
                    acc[j].balance = acc[j+1].balance;
                    acc[j+1].balance = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            if (acc[i].id != 0) {
                System.out.println(acc[i].id + "\t\t" + acc[i].name + "\t\t\t" + acc[i].balance);
            }
        }
    }




   public static void main(String args[]) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of Accounts: ");
    n = sc.nextInt();
    acc = new accounts[n];
    for(int i = 0; i< acc.length;i++) 
    {
        acc[i] = new accounts();
    }
    boolean flag = true;        
        while(flag) {
            System.out.println();
            System.out.println("Choose the functionality you want to perform:");
            System.out.println("1. Add account details\n2. Delete account details\n3. Display account details\n4. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if (count == n) {
                        System.out.println("Can't add more records.");
                    }
                    else {
                        add();
                    }
                    break;
                case 2:
                    if (count <= 0) {
                        System.out.println("Account records are empty.");
                    }
                    else {
                        delete();
                    }
                    break;
                case 3:
                    if (count <= 0) {
                        System.out.println("Nothing to display.");
                    }
                    else{
                        display();
                    }
                    break;
                case 4:
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option entered.");
            }
        }
   }
}

