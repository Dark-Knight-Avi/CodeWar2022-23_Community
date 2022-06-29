import java.io.*;
import java.util.*;

public class Solution {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void insertNodeAtTail(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = new Node(data);
            return;
        }
        newNode.next = null;
        Node last = head; 
        while (last.next != null)
            last = last.next;
        last.next = newNode;
        return;
    }
    public void printList(){
        Node tnode = head;
        while (tnode != null){
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
    }    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        Solution llist = new Solution();
        int n = sc.nextInt();
        int value;
        for(int i = 0; i < n; i++){
            value = sc.nextInt();
            llist.insertNodeAtTail(value);
        }
        llist.printList();
    }
}
