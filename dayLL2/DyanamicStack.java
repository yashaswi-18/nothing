package dayLL2;

import java.util.Scanner;

public class DyanamicStack {

	 Node tos;
	 
	 void createStack()
	 {
		 tos=null; 
	 }
	 //push
	 
	 void insertPush(int data)
	 {
		 Node n = new Node(data);
		 if(tos==null)
			 tos=n;
		 else 
		 {
			 n.next=tos;  
			 tos=n; 
		 }
		 System.out.println("Pushed");
	 }
	 //pop
	 void deletePop()
	 {
		 Node t;
		 if(tos==null)
			 System.out.println("Empty Stack");
		 else 
		 {
			t=tos ; //copy the tos node
			tos = tos.next;
			System.out.println("Deleted"+t.data);
		 }
	 }
	 
	 //peek
	 void peek()
	 {
		if(tos==null)
		{
			 System.out.println("Empty Stack");

		}
		else
		{
			System.out.println("Peek is : "+tos.data);
		}
	 }
	 
	 	//simple print
	 void printList()
	 {
		 if(tos==null)
		 {
			 System.out.println("Empty stack");
		 }
		 else
		 {
			 Node t = tos;
			 while (t!=null)
			 {
				 System.out.print("|" + t.data + "|");
				 t=t.next;
			 }
		 }
	 }
	 public static void main(String[] args)
	 {
		 Scanner in=new Scanner(System.in);
		 DyanamicStack obj=new DyanamicStack();
        obj.createStack();
        int ch;
        do
        {
          System.out.println("\n1.push \n2.pop \n3.Peek \n4.Print List\n0.Exit\n:");
          ch=in.nextInt();//read
          switch(ch)
          {
              case 1:
                      System.out.println("\nEnter a number:");
                      int e=in.nextInt();
                      obj.insertPush(e);
                      break;
             
              case 2:
                     obj.deletePop();
                     break;
             
              case 3 :
            	    obj.peek();
            	    break;
              case 4:
                     System.out.println("\nelements in stack:");
                     obj.printList();
                      break;
              case 0:
                      System.out.println("Exiting");
                  break;
              default:
                      System.out.println("Wrong Choice");
                  break;
          }
            
        }while(ch!=0);
    }
   
}
