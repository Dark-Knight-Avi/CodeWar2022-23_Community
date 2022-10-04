class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        Arrays.sort(strs);
        String newStr = "";
        String temp = "";
        for (int i = 0; i < strs[0].length(); i++) {
            temp = strs[0].substring(0, i + 1);
            if (strs[strs.length - 1].startsWith(temp)) {
                newStr = temp;
            }
        }
        return newStr;
    }
}
