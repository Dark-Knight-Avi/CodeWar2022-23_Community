class Solution {
    public int maximum69Number (int num) {
        int right = -1;
        int len = 0;
        int temp = num;
        while(temp > 0){
            int cur = temp % 10;
            if(cur == 6){
                right = len;
            }
            len++;
            temp = temp / 10;
        }
        if(right == -1)
            return num;
        return num + (int) (3 * Math.pow(10, right));
    }
}
