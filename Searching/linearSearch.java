package Searching;

public class linearSearch {
	
	static int LinearSearch(int a[] , int key)
	{
	    for(int i=0;i<a.length;i++)
	    {
	          if(key == a[i])
	               return i;  //found
	    }
	    return -1 ;   // not found

	}
	
	
	public static void main(String args[])
	{
		int a[] = {11,25,45,126,4,487,35};
		int key = 13656841;
		int re = linearSearch.LinearSearch(a,key);
		if(re==-1)
		{
			System.out.println(key +"not found");
		}
		else
		{
			System.out.println(key + " found at " + re);
		}
	}
}
