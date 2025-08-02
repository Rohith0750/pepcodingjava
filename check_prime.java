package Strivers;
import java.util.Scanner;

public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//			
//		}
//		if(count==2) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//		
//		This above code is brute force approach , the time complexity is o(n) So in order to reduce it we use the sqrt(n) to reduce time complexity.
		
		for(int i=1;i*i<n;i++) {
			if(n%i==0) {
				count++;
				
				if(n/i!=i) {
					count++;
					}
			}
					
		}
		if(count==2) {
			System.out.print(true);
		}else {
			System.out.println(false);
		}

	}

}
