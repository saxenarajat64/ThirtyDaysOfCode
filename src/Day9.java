import java.util.*;
public class Day9 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int result = factorial(number);
		System.out.print(result);
	}
	public static int factorial(int n){
		if(n>1){
			return n * factorial(n-1);
		}else{
			return 1;
		}
	}
}
