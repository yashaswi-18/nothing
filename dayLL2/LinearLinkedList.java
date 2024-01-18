package dayLL2;

import java.util.Scanner;

import day2.Queueex1;

public class LinearLinkedList {

	 Node root;
	 
	 void createList()
	 {
		 root=null; //nullify the root -> assigning it null so we know when to use it
	 }
	 
	 void insertLeft(int data)
	 {
		 Node n = new Node(data);
		 if(root==null)
			 root=n;
		 else 
		 {
			 n.next=root;  
			 root=n; 
		 }
	 }
	 void insertRight(int data)
	 {
		 Node n = new Node(data);
		 if(root==null)
			 root=n;
		 else 
		 {
			 Node t = root;
			 while(t.next!=null)
				 t=t.next;
			 t.next = n; 
		 }
	 }
	 
	 void deleteLeft()
	 {
		 Node t;
		 if(root==null)
			 System.out.println("Empty List");
		 else 
		 {
			t=root ; //copy the root node
			root = root.next;
			System.out.println("Deleted"+t.data);
		 }
	 }
	 
	 void deleteRight()
	 {
		 
		 if(root==null)
			 System.out.println("Empty List");
		 else 
		 {
			Node t , t2;
			t=t2 = root ; 
			while(t.next!=null)
			{
				t2=t;
				t=t.next;
			}
			if(t==root)
				root=null;
	        t2.next = null;
			System.out.println("Deleted"+t.data);
		 }
	 }
	 void search( int key)
	 {
		 if(root==null)
		 {
			 System.out.println("Empty list");
		 }
		 else
		 {
			 Node t = root;
			 while (t!=null && t.data!=key)
			 {
				 t=t.next;
				 if(t==null)
				 {
					 System.out.println(key + " not found");
					 
				 }
				 else if(t.data==key)
				 {
					 System.out.println("found"+t.data);
				 }
			 }
		 }
		 
	 }
	 void deleteKey( int key)
	 {
		if(root==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			Node t = root;
			Node t2 = root;
			while(t!=null && t.data!=key)
			{
				t2=t;
				t=t.next;
			}
			if(t==null)
			{
				System.out.println(key + "Not found");
			}
			else if(t.data == key)
			{
				System.out.println(key + "found in list");
				if(t==root) //case 1
				{
					root=root.next;
				}
				else if(t.next==null)//case 2
					t2.next=null;
				else //case 3
				{
					t2.next = t.next;
				}
				System.out.println("deleted" + t.data);
			}
			
		}
		 
	 }
	 
	 @SuppressWarnings("unused")
	void insertAt(int position ,int data)
	 {
		 Node n = new Node(data);
		 if(root==null)
			 root=n;
		 else 
		 {
			 Node t = root;
			 Node t2 = root;
			 int p=0;
			 if( position == 0)  //before root insert left -> 
			 {
				 n.next= root;
				 root=n;
				 
			 }
			 else if(p<position)
			 {
				 
	     		 while(t.next!=null && p<position) //2
	     		 {
	     			 t2=t;
	     			 t=t.next;
	     			 p++;
	     		 }
	     		 if(t==null)
	     		 {
	     			 System.out.println("position out of range");
	     		 }
	     		 else
	     		 {
	     			 t2.next=n;	     			 
	     			 n.next=t;
	     		 }
     			 System.out.println("inserted");

			 }	
		     	
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
			 Node t = root;
			 while (t!=null)
			 {
				 System.out.print("|" + t.data + "|");
				 t=t.next;
			 }
		 }
	 }
	 
	 void lastPosition()
	 {
		 //todo
	 }
	 
	 
	 public static void main(String[] args)
	 {
		 Scanner in=new Scanner(System.in);
		 LinearLinkedList obj=new LinearLinkedList();
         obj.createList();
         int ch,pos;
         do
         {
           System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right \n5.Print List \n6.search \n7.deleteKey \n8.Insert At \n0.Exit\n:");
           ch=in.nextInt();//read
           switch(ch)
           {
               case 1:
                       System.out.println("\nEnter a number:");
                       int e=in.nextInt();
                       obj.insertLeft(e);
                       break;
               case 2:
                       System.out.println("\nEnter a number:");
                       e=in.nextInt();
                       obj.insertRight(e);
                       break;    
               case 3:
                      obj.deleteLeft();
                      break;
               case 4:
                      obj.deleteRight();
                      break;
               case 5:
                      System.out.println("\nelements in list:");
                      obj.printList();
                       break;
               case 6:
            	     System.out.println("Enter the element that you want to search :");
            	     e=in.nextInt();
            	     obj.search(e);
            	     break;
               case 7:
          	        System.out.println("Enter the element that you want to delete :");
          	        e=in.nextInt();
          	        obj.deleteKey(e);
          	         break;
               case 8:
         	        System.out.println("Enter the position and element that you want to insert :");
         	        pos = in.nextInt();
         	        e=in.nextInt();
         	        obj.insertAt(pos,e);
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