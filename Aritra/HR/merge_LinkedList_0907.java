import java.util.Scanner;

public class Solution {
    Node head;
    static class Node {
        int data;
        Node next;
    
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void pushElem(Solution list, int data) {
        Node newNode = new Node(data);
        if (data < list.head.data){
            newNode.next = list.head;
            list.head = newNode;
            return;
        }
        Node cur = list.head;
        Node prev = null;
        do{
            prev = cur;
            cur = cur.next;
            if (cur == null){
                break;
            }
        } while (data >= cur.data);
        prev.next = newNode;
        newNode.next = cur;
    }
    public static void reverse(Solution list){
        Node cur = list.head;
        Node prev = null;
        Node next;
        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        list.head = prev;
    }
    public static void printList(Solution list) {
        Node cur = list.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            Solution list = new Solution();
            int n1 = sc.nextInt();
            for (int idx = 0; idx < n1; idx++) {
                list.push(sc.nextInt());
            }
            reverse(list);
            int n2 = sc.nextInt();
            for (int idx = 0; idx < n2; idx++) {
                data = sc.nextInt();
                pushElem(list, data);
            }
            printList(list);
        }
    }
}
