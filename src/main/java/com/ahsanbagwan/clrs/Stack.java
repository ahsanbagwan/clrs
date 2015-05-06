package com.ahsanbagwan.clrs;

import java.util.LinkedList;

public class Stack {
	int maxSize = 5;
	int top;
	LinkedList<Integer> elements = null;

	public Stack() {
		// TODO Auto-generated constructor stub
		this.elements = new java.util.LinkedList();
		this.top = -1;
	}

	public void push(int element) throws Exception {
		if (this.top > this.maxSize) {
			throw new Exception();
		}
		this.elements.add(top,element);
		this.top++;
	}

	public int pop() throws Exception {
		if (this.top == -1) {
			throw new Exception();
		}
		this.top--;
		return this.elements.remove();
	}

	public String toString() {
		return this.elements.toString();
	}

	public static void main(String[] args) {
		Stack stack = new Stack();

		try {
			stack.push(1);
			stack.push(2);

			System.out.println("stack structure " + stack);

			int poppedElement = stack.pop();
			System.out
					.println("Popped element (should be 1): " + poppedElement);

			stack.push(2);
			stack.push(2);
			stack.push(2);
			stack.push(2);
			stack.push(3);
			System.out.println("stack after adding 6 more elements " + stack.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
