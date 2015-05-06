package com.ahsanbagwan.clrs;

public class LinkedList {
	
	Node node;
	int size;
	public LinkedList(Node node){
		this.node = node;
	}
	
	public void add(Node node){
		this.node = node.next; 
	}
	
	
	class Node {
		int data;
		Node next;
	}
}
