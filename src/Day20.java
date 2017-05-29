import java.util.*;
import java.io.*;

public class Day20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// Write Your Code Here
		int arrayLength = a.length;
		int totalSwap = 0;
		for (int i = 0; i < arrayLength; i++) {
			int numOfSwaps = 0;
			for (int j = 0; j < arrayLength - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					numOfSwaps++;
					totalSwap++;
				}
			}
			if (numOfSwaps == 0) {
				break;
			}
		}

		System.out.println("Array is sorted in " + totalSwap + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);
	}

}
