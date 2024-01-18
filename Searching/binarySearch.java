package Searching;

public class binarySearch {

	static int BinarySearch(int a[],int start,int end,int key)
	{
	    if(start<=end)
	    {   
	    	int mid=(start+end)/2;
	        if(key==a[mid])
	        {	
	            return mid;
	        }
	        else
	        {   if(key<a[mid])
	            {
	                return BinarySearch(a,start,mid-1,key);
	            }
	            else
	            {	
	                return BinarySearch(a,mid+1,end,key);
	            }
	        }
	    }
	    else
	    { 
	    	return -1;
	    }
	}
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50,60};
		int key = 40;
		int re = binarySearch.BinarySearch(a,0,a.length-1,key);
		if(re==1)
		{
			System.out.println(key +" not found ");
		}
		else
		{
			System.out.println(key + " found at " + re);
		}
	}
	
}

