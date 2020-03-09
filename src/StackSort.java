import java.util.Scanner;
public class StackSort {
	Scanner sc = new Scanner(System.in);
	int input = sc.nextInt();
	public void Sort(Stack<Integer> left, Stack<Integer> right) {
		if(input >= left.top() && input < right.top())
			left.push(input);
		
		while(input < left.top()) {
			right.push(left.pop());
			if(left.top() <= input)
				left.push(input);
		}
		
		if(input > left.top() && input <= right.top())
			right.push(input);
		
		while(input > left.top() && input > right.top()) {
			left.push(right.pop());
			if(right.top() >= input)
				right.push(input);
		}
		System.out.println(left.toArray());
		System.out.println(right.toArray());
		
		
	}
}

