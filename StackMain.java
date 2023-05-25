
import java.util.Scanner;

class stack {
	private int[] arr;
	private int top;


public stack(int size) {
	arr=new int[size];
	top=-1;
}

public void push(int val) {
	
	if(isFull())
	{
		throw new RuntimeException("stack is full");
	}
	else {
	//top ++;
	arr[++top]=val;
}
}

public void display() {
	for(int i=top;i>=0;i--) {
		System.out.println(arr[i]);
	}
}

public void pop() {
	if(isEmpty()) {
		throw new RuntimeException("stack is empty");
	}
	else {
	top--;
	}
}

public int peek(){
	return arr[top];
}

public boolean isEmpty() {
	return top==-1;
}
public boolean isFull() {
	return top==arr.length-1;
}

}

public class StackMain {
	public static void main(String[] args) {
	
	stack s=new stack(5);
	s.push(45);
	s.push(50);
	s.push(60);
	s.push(70);
	s.push(80);
	s.display();
	
	

	//s.pop();
	System.out.println(s.peek());
	System.out.println(s.isEmpty());
	System.out.println(s.isFull());
//	s.display();

	
	
	
	
	
}
}



