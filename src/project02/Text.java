package project02;

import java.util.Queue;

public class Text {
	
	public static void main(String[] args) {
		MyQueue myQueue=new MyQueue();
		
		myQueue.add(34);
		myQueue.add(654);
		myQueue.add(64);
		myQueue.add(364);
		System.out.println(myQueue.isEmply());
		System.out.println(myQueue.peek());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		
		
		
	}

}
