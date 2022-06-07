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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        // List<Integer> positive = new List<>();
        // List<Integer> negative = new List<>();
        // List<Integer> zero = new List<>();     
        float positive = 0;
        float negative = 0;                   
        float zero = 0;    
        float arraySize = arr.size();                                          
        for(int i: arr){
            if(i < 0){
                // negative.add(i);
                negative++;
            }else if(i > 0){
                // positive.add(i);
                positive++;
            }else{
                // zero.add(i);
                zero++;
            }
        }
        // System.out.println((positive.size())/(arr.size()));
        // System.out.println((negative.size())/(arr.size()));
        // System.out.println((zero.size())/(arr.size()));        
        System.out.println(String.format("%.6f", positive/arraySize));
        System.out.println(String.format("%.6f", negative/arraySize));
        System.out.println(String.format("%.6f", zero/arraySize));        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
