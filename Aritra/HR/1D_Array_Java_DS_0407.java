import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            System.out.println(a.get(i)); 
        }
    }
}
