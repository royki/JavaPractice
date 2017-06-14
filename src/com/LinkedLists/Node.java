package com.LinkedLists;

public class Node {
	int data;
	Node node;
	
	// Constructors
	public Node(int newData){
		this.data = newData;
		this.node = null;
	}
	
	public Node(int newData, Node newNode){
		this.data = newData;
		this.node = newNode;
	}
	
	// Getters and Setters
	
	public int getData() {
		return data;
	}
	
	public Node getNode() {
		return node;
	}
	
	public void setData(int newData) {
		this.data = newData;
	}
	
	public void setNode(Node newNode) {
		this.node = newNode;
	}
}
