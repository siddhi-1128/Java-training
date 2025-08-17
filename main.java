class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void addToBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

   

    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }

    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != head) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = head;
        }
    }
}

public class main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addToBeginning(3);
        list.addToBeginning(5);
        list.addToBeginning(7);
        list.display();  // Output: 7 5 3
	list.addToEnd(1);
        list.addToEnd(4);
        list.addToEnd(6);
        list.display();
	list.deleteFromStart();
	list.deleteFromEnd();
	list.display();
    }
}
