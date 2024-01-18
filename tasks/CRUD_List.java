package tasks;

import java.util.Scanner;


public class CRUD_List {
   
	Enode root ;
	
	void createList()
	{
		root=null;
	}
	
	void insert(int emp_id, String name, String gender, double salary)
	{
		Enode n = new Enode( emp_id,name,gender,salary);
		if(root==null)
			 root=n;
		 else 
		 {
			 Enode t = root;
			 while(t.next!=null)
				 t=t.next;
			 t.next = n; 
		 }
		System.out.println("Data Inserted");
	}
	
	void update(Enode t) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Update name\n2. Update gender\n3. Update Salary");
        int i_ch = in.nextInt();
        in.nextLine(); 

        if (i_ch == 1) {
            System.out.println("Old name: " + t.name);
            System.out.print("Enter new name: ");
            t.name = in.nextLine();
            
        } else if (i_ch == 2) {
            System.out.println("Old gender: " + t.gender);
            System.out.print("Enter gender: ");
            t.gender = in.nextLine();
            
        } else if (i_ch == 3) {
            System.out.println("Old salary: " + t.salary);
            System.out.print("Enter new salary: ");
            t.salary = in.nextDouble();
            
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("\nData updated successfully");
    }

	Enode search(int emp_id) {
        Enode t = root;
        while (t != null) {
            if (t.emp_id == emp_id) {
                return t;
            }
            t = t.next;
        }
        return null;
    }
	void delete(int emp_id) {
        Enode t = root;
        Enode t2 = null;

        while (t != null && t.emp_id != emp_id) {
            t2 = t;
            t= t.next;
        }

        if (t!= null) 
        {
            if (t2 == null) 
            {
                root = t.next;
            } 
            else
            {
                
                t2.next = t.next;
            }
            System.out.println( emp_id + " deleted successfully.");
        } else {
            System.out.println( emp_id + " not found.");
        }
    }

	
	
	void printList()
	 {
		 if(root==null)
		 {
			 System.out.println("Empty list");
		 }
		 else
		 {
			 Enode t = root;
			 while (t!=null)
			 {
				 System.out.println(t.emp_id+ "," + t.name+","+t.gender + ","+t.salary);
				 t=t.next;
			 }
		 }
	 }
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 CRUD_List obj = new CRUD_List();
		 obj.createList();
         int ch;
         do
         {
           System.out.println("\n1. Register a new employee \n2. Search for an employee \n3. Update employee information \n4. Delete an employee \n5.Print\n0. Exit");
           ch=sc.nextInt();
           switch(ch)
           {
               case 1:
            	   System.out.print("Enter employee ID: ");
                   int id = sc.nextInt();
                   sc.nextLine(); 
                   System.out.print("Enter name: ");
                   String name = sc.nextLine();
                   System.out.print("Enter gender: ");
                   String gender = sc.nextLine();
                   System.out.print("Enter salary: ");
                   double salary = sc.nextDouble();
                   sc.nextLine(); 
                   obj.insert(id, name, gender, salary);
                   break;

               case 2:
            	   System.out.print("Enter emp_id to search: ");
                   int search_id= sc.nextInt();
                   sc.nextLine(); 
                   Enode empFound = obj.search(search_id);
                   if (empFound != null) {
                       System.out.println("Employee found:");
                       System.out.println("ID: " + empFound.emp_id);
                       System.out.println("Name: " + empFound.name);
                       System.out.println("Gender: " + empFound.gender);
                       System.out.println("Salary: " + empFound.salary);
                   } else {
                       System.out.println(search_id + " not found.");
                   }
                   break;
   
               case 3:
            	   System.out.print("Enter emp_id to update: ");
                   int update_id = sc.nextInt();
                   sc.nextLine(); 
                   Enode empToUpdate = obj.search(update_id);
                   if (empToUpdate != null) {
                       obj.update(empToUpdate);
                   } else {
                       System.out.println(update_id + " not found.");
                   }
                   break;

               case 4:
            	   System.out.print("Enter emp_id to delete: ");
                   int delete_id = sc.nextInt();
                   sc.nextLine(); 
                   obj.delete(delete_id);
                   break;
               case 5:
            	   System.out.println("Employee Data:");
                   obj.printList();
                   break;
               case 0:
                       System.out.println("Exit");
                   break;
               default:
                       System.out.println("Wrong Choice");
                   break;
           }
             
         }while(ch!=0);
     }
		
	 
	 
}
 


