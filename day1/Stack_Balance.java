package day1;

import java.util.Scanner;

public class Stack_Balance {

	/*
int Maxsize , tos ;
 char stack[];
	
	void createStack(int size)
	{
		Maxsize = size;
		tos=-1;
		stack = new char[Maxsize];
	}
	
   void push(char e)
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
   
   char  pop () {  //remove and returns
	   char temp = stack[tos]; //element ko  copy kro
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
   public static void main(String args[])
   {
	   // .length is property in array
	   // .length() is method in String
	   
	   Scanner sc = new Scanner(System.in);
	   Stack_Balance obj = new Stack_Balance();
	   System.out.print("Enter the brackets :");
	   String data = sc.nextLine();
	   boolean flag = true;
	   obj.createStack(data.length()); //creates array of size
	   
	   for(int i=0  ;i<data.length(); i++)
	   {
		   char c = data.charAt(i);
		   if(c == '{')
		   {
			   obj.push(c);
		   }
		   else if (c == '}')
		   {
			   if(obj.isEmpty()!= true) //if(obj.isEmpty == false)
			   {
				   char g = obj.pop();
			   }
			   if(obj.isEmpty() == true)
			   {
				   System.out.print("Error : } unexpected ");
				   flag = false;
				   break;
			   }
		   }
		   if(obj.isEmpty() == true && flag == true)
		   {
			   System.out.println("Balanced");
		   }
		   else
		   {
			   System.out.print("Error : { expected");
		   }
	   }
   }
   */
	   int MaxSize,tos;
	   char stack[];
	   void createStack(int size)
	   {
	       MaxSize=size;
	       tos=-1;
	       stack=new char[MaxSize];
	   }
	   void push(char e)
	   {
	       tos++;
	       stack[tos]=e;
	       System.out.println("Pushed "+e);
	   }
	   boolean isFull()
	   {
	       if(tos==MaxSize-1)
	           return true;
	       else
	           return false;
	    }
	   char pop()
	   {
	       char temp=stack[tos];
	       tos--;
	       return temp;
	   }
	    boolean isEmpty()
	   {
	       if(tos==-1)
	           return true;
	       else
	           return false;
	    }
	    public static void main(String args[])
	    {
	        Scanner in =new Scanner(System.in);
	        Stack_Balance obj=new Stack_Balance();
	        System.out.print("Enter data:");
	        String data=in.nextLine();
	        boolean flag=true;
	        char e;
	        int i;
	        obj.createStack(data.length());//creates array of size data
	        for (i=0;i<data.length();i++)
	        {
	            char c=data.charAt(i);
	            if(c=='{')
	                obj.push(c);        
	            else if(c=='}' && !obj.isEmpty())
	                {
	                    e=obj.pop();
	                }
	            else if(c=='}' && obj.isEmpty()) 
	                {
	                    System.out.print("Error: } unexpected");
	                    flag=false;
	                    break;
	                }   
	            }
	        
	        if(flag==true && obj.isEmpty())
	                    System.out.print("Balanced");
	        else if(!obj.isEmpty()&& flag==true)
	                    System.out.print("Error: } expected");
	    }
	
}
