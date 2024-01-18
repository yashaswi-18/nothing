package Sorting;

public class bubbleSort {

	static void BubbleSort(int a[])
	{
	   int i , j , t ;
	   for(i=0;i<a.length-1;i++)  // gave only passes
	   {
		   System.out.println("Passes "+(i+1));

	        for(j=0 ;j<a.length-1;j++) // j stops at second last 
	        {
	             if(a[j]>a[j+1])
	             {
	                t = a[j];
	                a[j] = a[j+1];
	                a[j+1] = t;
	              }
	        }
	   }
	}
	static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
          System.out.print(a[i]+",");
    }


	public static void main(String[] args) {
		int a[]={11,66,22,99,33,88,77,44,55};
	     System.out.println("Befor Sort:");
	     bubbleSort.printArray(a);
	     bubbleSort.BubbleSort(a);
	     System.out.println("\nAfter Sort:");
	     bubbleSort.printArray(a);
      
	}


	

}
