import java.util.*;
import java.io.*;

public class Day18 {
	Stack userStack = new Stack();
	Queue<Character> userQueue = new LinkedList<Character>();

	@SuppressWarnings("unchecked")
	private void pushCharacter(char c) {
		userStack.push(c);
	}

	private void enqueueCharacter(char c) {
		userQueue.add(c);
	}

	private char popCharacter() {
		char returnStackChar;
		returnStackChar = (char) userStack.pop();
		return returnStackChar;
	}

	private char dequeueCharacter() {
		char returnQueueChar;
		returnQueueChar = userQueue.poll();
		return returnQueueChar;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Day18 p = new Day18();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}
