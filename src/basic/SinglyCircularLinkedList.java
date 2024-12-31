package basic;

public class SinglyCircularLinkedList {
	
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
		n5.next = n1;
		
		System.out.println("Singly Circular Linked List:");
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
		System.out.println("Delete 6:");
		head = deleteNodeGivenVal(6, n1);
		traversal(head);
		System.out.println("Delete 7:");
		head = deleteNodeGivenVal(7, n1);
		traversal(head);
	}
	
	static Node insertNodeAtPos(int num, Node head, int pos) {
		Node newNode = new Node(num);
		if(head == null) {
			newNode.next = newNode;
			return newNode;
		}
		if(pos == 1) {
			Node tail = getTail(head);
			newNode.next = head;
			tail.next = newNode;
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
	
	static Node getTail(Node head) {
		Node currNode = head;
		if(currNode == null) {
			return null;
		}
		while(currNode.next != head) {
			currNode = currNode.next;
		}
		return currNode;
	}
	
	static Node insertNodeBeforeVal(int num, Node head, int val) {
		Node newNode = new Node(num);
		if(head == null) {
			newNode.next = newNode;
			return newNode;
		}
		if(head.num == val) {
			Node tail = getTail(head);
			newNode.next = head;
			tail.next = newNode;
			return newNode;
		}
		Node currNode = head;
		while(currNode.next != head && currNode.next.num != val) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return head;
	}
	
	static Node insertNodeAfterVal(int num, Node head, int val) {
		Node newNode = new Node(num);
		if(head == null) {
			newNode.next = newNode;
			return newNode;
		}
		Node currNode = head;
		while(currNode.next != head && currNode.num != val) {
			currNode = currNode.next;
		}
		newNode.next = currNode.next;
		currNode.next = newNode;
		return head;
	}
	
	static Node deleteNodeAtPos(int pos, Node head) {
		if(head == null || head.next == head) {
			return null;
		}
		if(pos == 1) {
			Node tail = getTail(head);
			tail.next = head.next;
			return head.next;
		}
		pos--;
		Node currNode = head;
		while(pos - 1 > 0 && currNode.next.next != head) {
			pos--;
			currNode = currNode.next;
		}
		currNode.next = currNode.next.next;
		return head;
	}
	
	static Node deleteNodeGivenVal(int val, Node head) {
		if(head == null || head.next == head) {
			return null;
		}
		if(head.num == val) {
			Node tail = getTail(head);
			tail.next = head.next;
			return head.next;
		}
		Node currNode = head;
		while(currNode.next.num != val && currNode.next.next != head) {
			currNode = currNode.next;
		}
		currNode.next = currNode.next.next;
		return head;
	}
	
	static void traversal(Node head) {
		Node currNode = head;
		
		System.out.print(currNode.num +"(head)");
		if(currNode.next != head) {
			currNode = currNode.next;
		}
		
		while(currNode != head) {
			System.out.print( " -> " + currNode.num);
			currNode = currNode.next;
		}
		
		System.out.println("(tail) -> " + currNode.num + "(head)");
		
	} 

}
