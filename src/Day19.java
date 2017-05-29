import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Day19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator1();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}

class Calculator1 implements AdvancedArithmetic  {

	public int divisorSum(int n) {
		int sumResult = 0;
		ArrayList<Integer> intArray = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				intArray.add(i);
			}
		}

		for (int i = 0; i < intArray.size(); i++) {
			sumResult = sumResult + intArray.get(i);
		}

		return sumResult;
	}
}
