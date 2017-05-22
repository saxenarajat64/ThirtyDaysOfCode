import java.util.*;
public class Day6 {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		scan.nextLine();
		for(int i=0 ;i <T;i++){
			char[] words = scan.nextLine().toCharArray();
			display(words);
		}
	}
	public static void display(char[]words){
		for(int i=0;i<words.length;i+=2){
			System.out.print(words[i]);
		}
		System.out.print(" ");
		for(int i=1;i<words.length;i+=2){
			System.out.print(words[i]);
		}
		System.out.println();
	}

}
