//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String printSequence(String S) 
    { 
        char [] charArr = S.toCharArray();
        String newStr = "";
        Map<Character, String> table = new HashMap<>();
        table.put('A', "2");
        table.put('B', "22");
        table.put('C', "222");
        table.put('D', "3");
        table.put('E', "33");
        table.put('F', "333");
        table.put('G', "4");
        table.put('H', "44");
        table.put('I', "444");
        table.put('J', "5");
        table.put('K', "55");
        table.put('L', "555");
        table.put('M', "6");
        table.put('N', "66");
        table.put('O', "666");
        table.put('P', "7");
        table.put('Q', "77");
        table.put('R', "777");
        table.put('S', "7777");
        table.put('T', "8");
        table.put('U', "88");
        table.put('V', "888");
        table.put('W', "9");
        table.put('X', "99");
        table.put('Y', "999");
        table.put('Z', "9999");
        table.put(' ', "0");
        for (char ch: charArr){
            newStr += table.get(ch);
        }
        return newStr;
    }
}
