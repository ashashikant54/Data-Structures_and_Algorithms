/**
 * Updating comments from Visual Studio on May 3rd 2020 
 */
package SearchingAlgorithms;

import java.lang.String.*;
import java.lang.Math.*;

public class BinarySearch {

	public static int search(int a[], int x, int start, int end) {
		
		int mid = start + Math.round((end-start)/2);
		
		if(x==a[mid]) {
			return mid;
		}
		else if (x>a[mid] && x<=a[end])
		{
			start = mid+1;
			return	search(a,x,start,end);		
		}
		else if (x<a[mid] && x>=a[start])
		{
			end = mid-1;
			return search(a,x,start,end);	
		}
		
			
		return -1;
		
	}
	


	public static void main(String args[]) {
		
		int a[] = {3,6,19,26,54,62,72,90};
		int ip = 3;
		int start = 0;
		int end = a.length -1;
				
		
		int z = search(a,ip,start,end);
		
		if (z== -1)
		{
			System.out.println("Given number " + ip + " is not in the list");
		}
		else
		System.out.println("Given number " + ip + " is at index " + z );
	}
}
