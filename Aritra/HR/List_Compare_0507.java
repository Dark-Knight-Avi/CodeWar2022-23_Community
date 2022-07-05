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
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public int isIdentical(Solution list){
        Node temp1 = this.head;
        Node temp2 = list.head;
        while (temp1 != null && temp2 != null){
            if (temp1.data != temp2.data){
                return 0;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return (temp1 != null && temp2 != null ? 0 : 1);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sol = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            Solution list1 = new Solution();
            Solution list2 = new Solution();
            int n1 = sc.nextInt();
            for (int idx = 0; idx < n1; idx++) {
                list1.push(sc.nextInt());
            }
            int n2 = sc.nextInt();
            for (int idx = 0; idx < n2; idx++){
                list2.push(sc.nextInt());
            }
            sol.add(list1.isIdentical(list2));
        }
        for (int i : sol){
            System.out.println(i);
        }
    }
}
