package Strivers;
import java.util.*;
import java.util.Scanner;

public class amstrongnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum =0;
		
		while(n>0) {
			int last_dig = n%10;
			sum = sum+(last_dig*last_dig*last_dig);
			n=n/10;	
		}
		
		 if(sum == temp) {
			 System.out.println(true);
		 }else {
			 System.out.println(false);
		 }
System.out.println();
	}

}
