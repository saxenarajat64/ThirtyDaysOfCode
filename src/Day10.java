import java.util.*;

public class Day10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		String binaryNumber = decimalToBinary(number);
		int recurrentOne = findRecurrentOne(binaryNumber);
		System.out.println(recurrentOne);
		
	}
	
	public static String decimalToBinary(int n){
		String outputString = "";
		String intermediateString = "";
		while(n>=1){
			intermediateString = intermediateString + n%2;
			n /= 2;
		}
		char[] intermediateCharArray = intermediateString.toCharArray();
		for(int i =intermediateString.length()-1;i>=0;i--){
			outputString = outputString + intermediateCharArray[i];
		}
		
		return outputString;
	}
	public static int findRecurrentOne(String binaryString){
		int outputInt =0;
		int counter =0;
		int finalResult = 0;
		char previousNumber = 0;
		char currentNumber = 0 ;
		char[] binaryArray = binaryString.toCharArray();
		for(int i=0;i<binaryString.length();i++){
			if(i==0){
				previousNumber = binaryArray[i];
			}
			currentNumber = binaryArray[i];
			if(currentNumber == '1'){
				if(previousNumber == '1'){
					counter+= 1;
					if(counter > finalResult){
					finalResult = counter;}
				}else{
					
					counter = 1;
				}
			}else{
				if(counter > finalResult){
				finalResult = counter;
				}
			}
			previousNumber = currentNumber;
				
		}
		return finalResult;
	}
}
