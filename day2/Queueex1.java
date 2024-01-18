package day2;

import java.util.Scanner;

import day1.Stackex1;

public class Queueex1 {
    int front , rear, Maxsize, q[];
    
  
	
	void createQueue(int size)
	{
		Maxsize = size;
	    front =0;
	    rear = -1 ;
		q = new int[Maxsize];
	}
	
	void enqueue(int e) //entry on queue
	{
		rear++;
		q[rear]=e;
		System.out.print("Enqueued "+e);
	}
	int dequeue()
	{
		int temp = q[front];
		front++;
		return temp;
	}
	
	boolean isFull()
	{
		if(rear == Maxsize-1)
			return true;
		else
			return false;
	}
	boolean isEmpty()
	{
		if(front>rear)
		   return true;
		else 
			return false;
	}
	void printQueue()
	   {
		   System.out.println("Queue has :");
		   for(int i=front ; i<=rear ; i++)
		   {
			   System.out.println(q[i]+" - ");
		   }
	   }
	public static void main(String[] args)
	{
		   int ch;
		   Scanner sc = new Scanner(System.in);
		   Queueex1 obj = new Queueex1();
		   System.out.print("Enter the size of queue:");
		   int size = sc.nextInt();
		   obj.createQueue(size); //creates array of size
		   do {
			   
			   System.out.print("\n1.Enqueue \n2.Dequeue \n3.Print \n0.Exit \n");
	           ch = sc.nextInt();
	           
	           switch(ch)
	           {
	           case 1:
	               if(obj.isFull()!=true)//if not full then inserted
	               {
	                   System.out.print("Enter elment:");
	                   int e=sc.nextInt();
	                   obj.enqueue(e);;
	               }
	               else
	                   System.out.print("Queue Full");
	               break;
	           case 2:
	               if(obj.isEmpty()!=true)//if not empty then element get removed
	               {
	                   System.out.print("Element removed:"+obj.dequeue());
	               }
	               else
	                   System.out.print("Queue Empty");
	               break;
	          
	           case 3:
	               if(obj.isEmpty()!=true)
	               {
	                 obj.printQueue();
	               }
	               else
	                   System.out.print("Queue Empty");
	               break;
	           case 0:
	                   System.out.print("Exiting code");
	                   break;
	           default:
	                   System.out.print("Wrong input");
	                   break;
	       }
	   }while(ch!=0);
		  
	}
}
