package dsa;
import java.util.*;
public class Findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int idx=-1;      //if element is not found it will return -1
		int d = sc.nextInt(); // target element 
		for (int i =0;i<arr.length;i++) { // itarate from 0 to arrlen
			if(arr[i]==d) {  
				idx=i;  //Stores the index i where the target was found.
				break;
				
			}
		}
		
		System.out.println(idx);
	}

}
