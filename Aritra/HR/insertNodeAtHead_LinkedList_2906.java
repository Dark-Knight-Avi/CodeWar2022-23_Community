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
    public void insertNodeAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        Node tnode = head;
        while(tnode != null){
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value;
        Solution llist = new Solution();
        for(int i = 0; i < n; i++){
            value = sc.nextInt();
            llist.insertNodeAtHead(value);
        }
        llist.printList();
    }
}
