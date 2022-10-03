class Solution {
    public int search(int[] nums, int target) {
        int idx = 0;
        for(int x: nums){
            if(x == target){
                return idx;
            }
            idx++;
        }
        return -1;
    }
}
