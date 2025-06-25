package dsa;
import java.util.*;
public class bynandsellstocks1 {

	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min = arr[0];
		int max_profit =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}else if(arr[i]-min>max_profit) {
				max_profit = arr[i]-min;
			}
		}
		return max_profit;

	}

}
