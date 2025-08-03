package Strivers;
import java.util.Scanner;


public class haf_gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int gcd=1;
		int n1 = sc.nextInt();
    	int n2 = sc.nextInt();
//		for(int i=1;i<n1;i++) {
//			if(n1%i==0 && n2%i==0) {
//				gcd=i;
//			}
//		}
//		System.out.println(gcd);
    	
    	//This has time complexity 0(min(n1,n2))
    	
    	//To reduce the time complexity we use Equilaterial Algorithm 
    	
    	while(n1!=0 && n2!=0) {
    		if(n1>n2) { 
    			n1=n1%n2;
    			}
    		else {
    			n2=n2%n1;
    		}
    	}
    	
    	System.out.println(n1==0?n2:n1);
    	
    	
		
   }

}
