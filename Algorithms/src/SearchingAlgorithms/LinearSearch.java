/**
 * 
 */
package SearchingAlgorithms;

import java.lang.String.*;

public class LinearSearch {

	public static int search(int a[], int x) {
		
		
		int arrsize = a.length;
		
		for(int i=0;i<arrsize;i++)
		{
			if ((int)x == a[i])
			{
				return i; //	System.out.println("Given number"+ x + "is at" + a[i] );
			}
		}
		return -1;
		
	}
	
	public static void main(String args[]) {
		
		int a[] = {10,5,4,9,8,2,6,3};
		int b = 7;
		
		int z = search(a,b);
		
		if (z== -1)
		{
			System.out.println("Given number " + b + " is not in the list");
		}
		else
		System.out.println("Given number " + b + " is at position " + z );
	}
}
