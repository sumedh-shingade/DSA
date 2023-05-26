


class LinearQueue{
	
	private int[] arr;
	
	private int rear,front;
	
	public LinearQueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
		}
	
	public void display() {
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("\t"+arr[i]);
		}
	}
	
	public boolean isEmpty() {
	return	front==rear;
	}
	
	public boolean isFull() {
	return rear==arr.length-1;
	}
	
	
	
	public void push(int val) {
		if(isFull()) {
			throw new RuntimeException("Queue is Full");
		}
		else {
		rear++;
		arr[rear]=val;
		}
		
	}
	
	public void pop() {
		if(isEmpty()) {
		throw new RuntimeException("Queue is empty");
		}
		else {
		
		front++;
		}
	}
	public int peek() {
		return arr[front+1];
		
	}
	
	
}


public class QueueMain {
public static void main(String[] args) {
	LinearQueue Lq=new LinearQueue(3);
		Lq.push(10);
		Lq.push(20);
		Lq.push(30);
		
		Lq.display();
	
}
}
