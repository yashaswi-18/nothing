package Sorting;

public class ImprovebubbleSort {

	static void BubbleSort(int a[])
	{
	   int i , j , t;
	   boolean done = true;
	   for(i=0;i<a.length-1;i++)  // gave only passes
	   {
		   System.out.println("Passes "+(i+1));
	        for(j=0 ;j<a.length-i-1;j++) // j stops at second last 
	        {
	             if(a[j]>a[j+1])
	             {
	                t = a[j];
	                a[j] = a[j+1];
	                a[j+1] = t;
	                done = false;
	              }
	        }
	        if(done)
	        {
	        	break;
	        }
	   }
	}
	static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
          System.out.print(a[i]+",");
    }


	public static void main(String[] args) {
		int a[]={11,20,30,40,50};
	     System.out.println("Befor Sort:");
	     ImprovebubbleSort.printArray(a);
	     ImprovebubbleSort.BubbleSort(a);
	     System.out.println("\nAfter Sort:");
	     ImprovebubbleSort.printArray(a);
      
	}


	

}
