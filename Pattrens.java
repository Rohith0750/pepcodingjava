package Strivers;

class patterns{
	public void printTriangle(int n) {
		for (int i =0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printpattren2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void printpattren3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
			
	}
	public void printpattren4(int n) {
		for(int i=0;i<=n;i++){
		    for(int j=1;j<n-i+1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
	
	public void printpattren5(int n) {
		for(int i=0;i<=n;i++){
		    for(int j=1;j<n-i+1;j++){
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
	
	public void printpattren6(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
			System.out.print(" ");
		}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
		System.out.println();	
	}
}
    
	public void printpattren7(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <2*n - (2*i + 1); j++)
 {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}
public class Pattrens {

	public static void main(String[] args) {
		patterns pat = new patterns();
		pat.printpattren7(5);

	}

}
