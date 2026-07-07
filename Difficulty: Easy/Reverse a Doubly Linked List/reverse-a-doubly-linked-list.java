/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        //1. swap the next and prev pointer but before the temp is storing the prev of og l-list so in the end when we do temp.prev it points to the head
        // code here
        Node current = head;
        Node temp = null;
        
        while(current != null) {
            //swap the next and prev pointers of each data in result we will get reversed linked list
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            
            current = current.prev;
        }
        if (temp != null) head = temp.prev;
            
        return head;
    }
}