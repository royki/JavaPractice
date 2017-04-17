package com.LinkedLists;

import java.util.LinkedList;

public class LinkedListM {

	Node nodeHead;
	int count;

	// public LinkedListM() {
	// nodeHead = null;
	// count = 0;
	// }

	public LinkedListM(int data) {
		nodeHead = new Node(data);
		count = 1;
	}

	// Methods
	// Add Node
	public void add(int newData) {
		Node temp = new Node(newData);
		Node current = nodeHead;
		while (current.getNode() != null) {
			current = current.getNode();
		}
		current.setNode(temp);
		count++;
	}

	// Get Node
	public int get(int index) {
		if (index <= 0) {
			return -1;
		}
		Node current = nodeHead;
		for (int i = 1; i < index; i++) {
			current = current.getNode();
		}
		return current.getData();
	}

	// Node size
	public int nodeSize() {
		return count;
	}

	// Node isEmpty
	public boolean isEmpty() {
		return nodeHead == null;
	}

	// Remove Node
	public void removeNode() {
		// remove from back of the list
		Node current = nodeHead;
		while (current.getNode().getNode() != null) {
			current = current.getNode();
		}
		current.setNode(null);
		count--;
	}

	public static void main(String[] args) {
		// LinkedList<String> linkedList = new LinkedList<String>();
		// linkedList.add("Alice");
		// System.out.println(linkedList);
		// linkedList.add("Alicey");
		// System.out.println(linkedList);
		// linkedList.remove();
		// System.out.println(linkedList);

		LinkedListM llm = new LinkedListM(2);
		llm.add(2);
		llm.add(3);
		llm.add(4);
		System.out.println(llm.nodeSize());
		System.out.println(llm.isEmpty());
		llm.removeNode();
		llm.removeNode();
		llm.removeNode();
		System.out.println(llm.isEmpty());
	}

}
