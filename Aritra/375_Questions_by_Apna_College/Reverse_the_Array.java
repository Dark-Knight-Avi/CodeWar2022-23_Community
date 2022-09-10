import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [][] testArray = new int[100][100];
		for (int i = 0; i < t; i++){
		    int n = sc.nextInt();
		    int [] arr = new int[n];
		    for (int idx = 0; idx < n; idx++){
		        arr[idx] = sc.nextInt();
		    }
		    int mid = (n / 2);
		    int pStart = 0;
            int pEnd = n - 1;
            while(pStart != mid){
	            int temp = arr[pStart];
                arr[pStart] = arr[pEnd];
                arr[pEnd] = temp;
                pStart++;
                pEnd--;
	        }
	        testArray[i] = arr;
		}
		for (int i = 0; i < t; i++){
            int [] a = testArray[i];
		    for(int num: a){
		        System.out.print(num + " ");
		    }
		    System.out.println();
		}
	}
}
