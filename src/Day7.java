import java.io.*;
import java.util.*;

public class Day7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		display(arr);
	
	}
	public static void display(int[] array){
		for(int i=array.length-1;i>=0;i--){
			System.out.print(array[i]);
			if(i!=0){
				System.out.print(" ");
			}
		}
	}
}
