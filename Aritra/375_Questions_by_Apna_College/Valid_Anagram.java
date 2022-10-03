class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr1.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++){
            arr2.add(t.charAt(i));
        }

        Collections.sort(arr1);
        Collections.sort(arr2);
//        for (char ch: arr1){
//            System.out.print(ch);
//        }
//        System.out.println();
//        for (char ch: arr2){
//            System.out.print(ch);
//        }
//        System.out.println();
        HashSet<Character> set1 = new HashSet<>(arr1);
        HashSet<Character> set2 = new HashSet<>(arr2);
        int len1 = arr1.size();
        int len2 = arr2.size();
        if(len1 > len2 && set1.size() != set2.size() && len2>=2) {
            for (int i = 0; i <= len1 - len2; i++) {
                ArrayList<Character> temp = new ArrayList<>();
                for (int j = i; j < i + len2; j++){
                    temp.add(arr1.get(j));
                }
//                for (char ch : temp){
//                    System.out.print(ch);
//                }
//                System.out.println();
                if (temp.equals(arr2)){
                    return true;
                }
            }
        } else if (len1 == len2){
            return Objects.equals(arr1, arr2);
        }
        return false;
    }
}
