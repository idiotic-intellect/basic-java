package basic;

public class SinglyLinkedList {

	static class Node {
		int num;
		Node next;
		Node(int num) {
			this.num = num;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		System.out.println("Singly Linked List:");
		traversal(n1);
		System.out.println("Insert 7 as 4th element:");
		Node head = insertNodeAtPos(7, n1, 4);
		traversal(head);
		System.out.println("Insert 6 before 7:");
		head = insertNodeBeforeVal(6, n1, 7);
		traversal(head);
		System.out.println("Insert 8 after 7:");
		head = insertNodeAfterVal(8, n1, 7);
		traversal(head);
		System.out.println("Delete 6th element");
		head = deleteNodeAtPos(6, n1);
		traversal(head);
		System.out.println("Delete 7:");
		head = deleteNodeGivenVal(7, n1);
		traversal(head);
		System.out.println("Delete 6:");
		head = deleteNodeGivenVal(6, n1);
		traversal(head);
	}
	
	static Node insertNodeAtPos(int num, Node head, int pos) {
		Node newNode = new Node(num);
		if(head == null) {
			return newNode;
		}
		if(pos == 1) {
			newNode.next = head;
			return newNode;
		}
		Node currNode = head;
		pos--;
		while(pos - 1 > 0) {
			pos--;
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return head;
	}
	
	static Node insertNodeBeforeVal(int num, Node head, int val) {
		Node newNode = new Node(num);
		if(head == null) {
			return newNode;
		}
		if(head.num == val) {
			newNode.next = head;
			return newNode;
		}
		Node currNode = head;
		while(currNode.next != null && currNode.next.num != val) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return head;
	}
	
	static Node insertNodeAfterVal(int num, Node head, int val) {
		Node newNode = new Node(num);
		if(head == null) {
			return newNode;
		}
		Node currNode = head;
		while(currNode.next != null && currNode.num != val) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return head;
	}
	
	static Node deleteNodeAtPos(int pos, Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		if(pos == 1) {
			return head.next;
		}
		pos--;
		Node currNode = head;
		while(pos - 1 > 0 && currNode.next.next != null) {
			pos--;
			currNode = currNode.next;
		}
		currNode.next = currNode.next.next;
		return head;
	}
	
	static Node deleteNodeGivenVal(int val, Node head) {
		if(head == null || head.next == null) {
			return null;
		}
		if(head.num == val) {
			return head.next;
		}
		Node currNode = head;
		while(currNode.next.num != val && currNode.next.next != null) {
			currNode = currNode.next;
		}
		currNode.next = currNode.next.next;
		return head;
	}
	
	static void traversal(Node currNode) {
		while(currNode != null) {
			System.out.print(currNode.num + " -> ");
			currNode = currNode.next;
		}
		System.out.println("null");
	}

}
