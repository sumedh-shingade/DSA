package Queue;
import java.util.Scanner;

class CircularQueue {
	
private int[] arr;
	
	private int rear,front;
	
	public CircularQueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
		}
//	
//
		
	
	
	public boolean isEmpty() {
	return (rear==front && front==-1);
	}
	
	public boolean isFull() {
	return ((front==-1 && rear==arr.length-1) || (front==rear && front!=-1));
	}
	
	public void display() {
		System.out.println("the elements are :");
		for(int i=front+1;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public void push(int val) {
	if(isFull()) {
			throw new RuntimeException("Queue is full ");
	}
		rear=(rear+1)%(arr.length);
		arr[rear]=val;
	
		
	}
	
	public void pop() {
		
		if(isEmpty()) 
			throw new RuntimeException("queue is empty ");
		
		front=(front+1)%(arr.length);
		if(front==rear)
		{
			front=-1;
			rear=-1;	
		}
		

		
	}
	
	public int peek() {
		if(isEmpty()) 
			throw new RuntimeException("queue is empty ");
		
		int t=(front+1)%arr.length;
		return arr[t];
	}
	
	
}

public class CircularQueueMain{
	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue(3);
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
					q.push(val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2: // pop
				try {
					val = q.peek();
					q.pop();
					System.out.println("Popped: " + val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3: // peek
				try {
					val = q.peek();
					System.out.println("Peek: " + val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 4: // display
				try {
					q.display();
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		}while(choice != 0);
		sc.close();
		
		
}
}