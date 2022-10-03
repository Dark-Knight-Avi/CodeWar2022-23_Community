class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> st = new Stack<>();
        char [] arr = s.toCharArray();
        ArrayList<Character> charArray = new ArrayList<>();
        charArray.add('}');
        charArray.add(')');
        charArray.add(']');
        for (char ch: arr){
            if (charArray.contains(ch)){
                if (st.empty()){
                    return false;
                }
                if (ch == map.get(st.pop())){
                    continue;
                }
                return false;
            } else {
                st.push(ch);
            }
        }
        return st.empty();
    }
}
