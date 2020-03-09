

import java.util.Scanner;
public class Palindromes {
	public static void main(String[] args) {
		
	}
	public static String isPalindrome() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String nospace = input.replaceAll("[\\W]","");
		
		Stack<String> PalinStack = new ArrayStack<String>(nospace.length());
		Queue<String> PalinQueue = new DoublyLinkedQueue<String>();
		
		for(char c: nospace.toCharArray()) {
			PalinStack.push(nospace.valueOf(c));
			PalinQueue.enqueue(nospace.valueOf(c));
		}
		while(!PalinStack.isEmpty() && !PalinQueue.isEmpty()) {
			if(!PalinStack.pop().equalsIgnoreCase(PalinQueue.dequeue()))
				return "Not a Palindrome";
		}
		return "Is a Palindrome";
	}
	

}
