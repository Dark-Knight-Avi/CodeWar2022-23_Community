import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 0; i < n; i++){
            value = sc.nextInt();
            list.add(value);
        }
        for(int i = 0; i < n; i++){
            System.out.println(list.get(i));
        }
    }
}
