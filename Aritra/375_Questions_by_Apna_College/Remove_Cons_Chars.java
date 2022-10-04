class Solution{
    public String removeConsecutiveCharacter(String S){
        String newStr = "";
        for(int i = 0; i < S.length() - 1; i++){
            if(S.charAt(i) == S.charAt(i+1)){
                continue;
            } else {
                newStr += String.valueOf(S.charAt(i));
            }
        }
        newStr += String.valueOf(S.charAt(S.length() - 1));
        return newStr;
    }
}
