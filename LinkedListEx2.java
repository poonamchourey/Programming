package ds;

//Nth node from end of the linkedList....
public class LinkedListEx2 {

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

	public static void nthNode(Node head, int n) {
		if (head == null)
			return;
		Node t = head;
		
		int count = 0;
		while (t != null) {
			// System.out.print(" "+t.data);
			count++;
			t = t.next;
		}
		System.out.println(" Length of the list is : " + count);
		int nthNode = count - n;
		
		if (count < n) {
			System.out.print("-1");
			return;
		}
		t = head;
		count = 0;

		while (count != nthNode) {
			t = t.next;
			count++;
		}

		System.out.print(" nth node data is " + t.data);

	}

	public static void main(String[] args) {

		insert(10);
		insert(17);
		insert(33);
		insert(38);

		show();
		nthNode(head, 5);

	}

}
