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
     * Complete the 'powerSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER X
     *  2. INTEGER N
     */
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n % 2 == 0){
            return power(x, n/2) * power(x, n/2);
        }
        else{
            return power(x, n/2) * power(x, n/2) * x; 
        }
    }
    public static int powerSum(int X, int N, int C) {
        if(power(C, N) < X){
            return powerSum(X, N, C + 1) + powerSum(X - power(C, N), N, C + 1);
        }
        else if(power(C, N) == X){
            return 1;
        }
        else{
            return 0;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = Integer.parseInt(bufferedReader.readLine().trim());

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.powerSum(X, N, 1);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
