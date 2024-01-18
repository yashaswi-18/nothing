package day1;

import java.util.Scanner;

public class Stackex1 {

	int Maxsize , tos , stack[];
	
	void createStack(int size)
	{
		Maxsize = size;
		tos=-1;
		stack = new int[Maxsize];
	}
	
   void push(int e)
   {
	   tos++;
	   stack[tos]=e; //e from user 
   }
   
   boolean isFull()
   {
	   if(tos==Maxsize-1) //similar like array 0 to n-1
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   
   int  pop () {  //remove and returns
	   int temp = stack[tos]; //element ko  copy kro
	   tos --;
	   return temp ;
   }
   
   boolean isEmpty()
   {
	   if(tos == -1)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }
   
   int peek()
   {
	   return stack[tos]; // return who is a topper 
   }
   
   
   void printStack()
   {
	   System.out.println("stack has :");
	   for(int i=tos ; i>=0 ; i--)
	   {
		   System.out.println(stack[i]);
	   }
   }
   
   public static void main(String args[])
   {
	   int ch;
	   Scanner sc = new Scanner(System.in);
	   Stackex1 obj = new Stackex1();
	   System.out.print("Enter the size of stack:");
	   int size = sc.nextInt();
	   obj.createStack(size); //creates array of size
	   do {
		   
		   System.out.print("1.Push\n2.Pop \n3.Peek \n4.Print \n0.Exit");
           ch = sc.nextInt();
           
           switch(ch)
           {
           case 1:
               if(obj.isFull()!=true)//if not full then push
               {
                   System.out.print("Enter elment:");
                   int e=sc.nextInt();
                   obj.push(e);
               }
               else
                   System.out.print("Stack Full");
               break;
           case 2:
               if(obj.isEmpty()!=true)//if not empty then pop
               {
                   System.out.print("Element Poped:"+obj.pop());
               }
               else
                   System.out.print("Stack Empty");
               break;
           case 3:
               if(obj.isEmpty()!=true)//if not empty then pop
               {
                   System.out.print("Element @ Peek is:"+obj.peek());
               }
               else
                   System.out.print("Stack Empty");
               break;
           case 4:
               if(obj.isEmpty()!=true)//if not empty then pop
               {
                 obj.printStack();
               }
               else
                   System.out.print("Stack Empty");
               break;
           case 0:
                   System.out.print("Exiting code");
                   break;
           default:
                   System.out.print("Wrong input");
                   break;
       }
   }while(ch!=0);
	  
   

}}