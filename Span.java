package dsa;
import java.util.*;
/* Span of array
 You have gave a number  n representing the count of elements 
 you have gave a n numbers
 You have requeried to find a span of an input . Span is defined as Differnece of max val and min val
  */
public class Span {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			int max=arr[0];
			int min = arr[0];
			for(int i=0;i<arr.length;i++) { 
				
				if (arr[i]>max) {
					max=arr[i];
				}
				
				if (arr[i]<min) {
					min=arr[i];
				}
				
			}
			
			int span = max-min;
			System.out.println(span);
		
	}

}
