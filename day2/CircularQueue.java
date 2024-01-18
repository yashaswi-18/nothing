package day2;

import java.util.Scanner;

import day1.Stackex1;

public class CircularQueue {
	
    int front , rear, Maxsize, q[],count;
    

	void createQueue(int size)
	{
		Maxsize = size;
	    front =0;
	    rear = -1 ;
	    count = 0;
		q = new int[Maxsize];
	}
	
	void enqueue(int e) //entry on queue
	{
	
		rear=(rear+1)%Maxsize;
		count++;
		q[rear]=e;

	}
	int dequeue()
	{
		int temp = q[front];
		front =(front+1)%Maxsize;
		count--;
		return temp;
	}
	
	boolean isFull()
	{
		if(count == Maxsize)
			return true;
		else
			return false;
	}
	boolean isEmpty()
	{
		if(count==0)
		   return true;
		else 
			return false;
	}
	void printQueue()
	   {
		   int i = front;
		   int c = 0;
		   while(c < count)
		   {
			   System.out.print(q[i]+"--");
			   i = (i+1)%Maxsize;
			   c++;
		   }
	   }
	public static void main(String[] args)
	{
		   int ch;
		   Scanner sc = new Scanner(System.in);
		   CircularQueue obj = new CircularQueue();
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
	                   obj.enqueue(e);
	                   
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
