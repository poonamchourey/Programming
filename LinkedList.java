package ds;

import java.util.Scanner;

public class LinkedList {

	static class Node {
		int data;
		Node next;
	}

	static Node head;

	public static void insert(int data) {
		// creating a node
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node t = null;
			t = head;
			while (t.next != null) {
				t = t.next;
			}
			t.next = node;
		}
	}

	// insert at end
	public static void insert(int data, int place) {
		// creating a node
		Node node = new Node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			Node t = null;
			t = head;
			while (t.next.data != place) {
				t.next = t;
			}
			node.next = t.next;
			t.next = node;
		}
	}

	public static void show() {
		if (head == null)
			return;
		else {
			Node t = null;
			t = head;
			while (t.next != null) {
				System.out.print(t.data + " ");
				t = t.next;
			}
			System.out.print(t.data);
		}

	}

	public static int getMiddle(int size) {
		int sizeList = 0;
		if (head == null)
			return 0;
		else {
			Node t = null;
			t = head;
			while (t.next != null) {
				sizeList++;
				t = t.next;
			}
		}
		// loop till n/2 time...
		Node t = null;
		t = head;
		if (sizeList % 2 == 0) {

			for (int i = 0; i < sizeList / 2; i++) {
				t = t.next;
			}
			return t.data;
		} else {
			for (int i = 0; i <= (sizeList / 2); i++) {
				t = t.next;
			}
			return t.data;
		}

	}

	public static void main(String args[]) {
		Node n = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size....");

		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int v = sc.nextInt();
			insert(v);
		}

		System.out.print(getMiddle(size));
	}
}
