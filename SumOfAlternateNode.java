package ds;

public class LnkedListDeleteAlternateNode {

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
//sum of alternate node
	public static void deleteAlternateNode() {
		if (head == null)
			return;

		Node p = head;
		Node t = head.next;
		int sum = 0;

		while (p != null && t != null) {
			System.out.print(p.data);
			sum +=p.data;
			p.next = t.next;
			t = null;
			p = p.next;
			if (p != null) {
				t = p.next;
				System.out.print(" ");
			}
			
		}
		if (p != null) {
		System.out.print(p.data);
		sum +=p.data;
		}
		System.out.print("  sum is " +sum);
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

	public static void main(String[] args) {

		insert(10);
		insert(17);
		insert(33);
		insert(38);
		insert(73);
		

		//show();
		deleteAlternateNode();
		// show();

	}

}
