package Queue;

import java.util.Scanner;

class Linear{
	
	private int[] arr;
	
	private int rear,front;
	
	public Linear(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
		}
	
	public void display() {
		System.out.println("The elements are: ");
		for(int i=front+1;i<=rear;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public boolean isEmpty() {
	return rear==front;
	}
	
	public boolean isFull() {
	return rear==arr.length-1;
	}
	
	
	
	public void push(int val) {
		if(isFull()) 
			throw new RuntimeException("Queue is Full");
		
	
		rear++;
		arr[rear]=val;
		
		
	}
	
	public void pop() {
		if (isEmpty()) {
	        throw new RuntimeException("Queue is empty");
	    }
		 
		    front++;
		
		
	}
	public int peek() {
		if(isEmpty()) 
			throw new RuntimeException("Queue is empty");
			
		return arr[front+1];
		
	}
	
	
}


public class LinearQueue {
public static void main(String[] args) {
	Linear Lq=new Linear(3);
	Scanner sc=new Scanner(System.in);
	
	int choice, val;
	do {
		System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\n4. Display\nEnter choice: ");
		choice = sc.nextInt();
		switch(choice) {
		case 1: // push
			try {
				System.out.print("Enter value to push: ");
				val = sc.nextInt();
				Lq.push(val);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2: // pop
			try {
				val = Lq.peek();
				Lq.pop();
				System.out.println("Popped: " + val);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 3: // peek
			try {
				val = Lq.peek();
				System.out.println("Peek: " + val);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
			
		case 4: // display
			try {
				Lq.display();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		}
	}while(choice != 0);
	sc.close();
	
	
	
}
}