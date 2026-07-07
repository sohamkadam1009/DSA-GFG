/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        
        Node newNode = new Node(x); //it will asssign the address and prev and next will be null
        
        // Empty list
        if (head == null) {
            return newNode;
        }
        
        Node current = head; //current will be our traversal
        
        for(int i=0;i<p;i++) {
            //update current
            current = current.next;
        }
        
        //will give the address of the next node
        Node nextNode = current.next;
        
        //update the prev and next pointer for new node
        newNode.prev = current;
        newNode.next = nextNode;
        
        //th
        current.next = newNode;
        
        if(nextNode != null) {
            //update the next node's prev pointer and now it will point to newely created node
            nextNode.prev = newNode;
        }
        
        return head;
    }
}