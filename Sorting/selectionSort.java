package Sorting;

public class selectionSort {

	static void selectionSort( int a[] )
	{
	   int i, j , min ,pos ;
	   for( i = 0 ; i<a.length-1;i++)
	   {
	        min=a[i];
	        pos = i ;
	        for(j = i+1 ; j<a.length;j++)
	        {
	            if(a[j]<min)
	            {
	                min = a[j];
	                pos = j ;
	            }
	         }
	         a[pos]=a[i];
	         a[i] = min;
	    }
	} 
	static void insertionSort(int a[])
			{
			   int i , j , new_element;
			   for(i=0;i<a.length-1;i++)
			   {
			       new_element = a[i+1];
			       j=i+1;
			       while(j>0 && a[j-1]>new_element)
			       {
			            a[j] = a[j-1];
			            j--;
			       }
			        a[j] = new_element;
			    }
			}
	static void mergeSort(int a[] , int start , int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merger(a,start,mid,end);
		}
	}
	static void merger(int a[],int start , int mid , int end)
	{
		int i,j,temp[],tindex;
		temp=new int[a.length];
		i=start;
		j=mid+1;
		tindex=start;
		while(i<=mid && j<=end)
		{
			if(a[i]<a[j])
				temp[tindex++]=a[i++];
			else if(a[j]<a[i])
				temp[tindex++]=a[j++];
		}
		while(i<=mid)
			temp[tindex++]=a[i++];
		while(j<=end)
			temp[tindex++]=a[j++];
		for(i=start;i<=end;i++)
		{
			a[i]=temp[i];
		}


	}
	static void quickSort(int a[] , int start , int end )
	{
	     int i = start ;
	     int j = end ;
	     int pivot = start;
	     while(i<j)
		{
			while(a[i]<a[pivot])
			    i++;
			while(a[j]>a[pivot])
				j--;
			if(i<j)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		if(i<end)
			quickSort(a,i+1,end);
		if(j>start)
			quickSort(a,start,j-1);
	    
	}

	static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
          System.out.print(a[i]+",");
    }

  public static void main(String args[])
  {
	 int a[]={140,50,66,55,77,11};
	System.out.println("before sort");
	selectionSort.printArray(a);
	//selectionSort.selectionSort(a);
	System.out.println("\nAfter sort");
	//selectionSort.mergeSort(a, 0, a.length-1); 
	//selectionSort.quickSort(a, 0, a.length-1);
	selectionSort.printArray(a);
	
	}
}




























