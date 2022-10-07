class Solution {
    public String intToRoman(int num) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        arr1.add(1);
        arr1.add(5);
        arr1.add(10);
        arr1.add(50);
        arr1.add(100);
        arr1.add(500);
        arr1.add(1000);
        arr2.add("I");
        arr2.add("V");
        arr2.add("X");
        arr2.add("L");
        arr2.add("C");
        arr2.add("D");
        arr2.add("M");
        String str = "";
        while(num > 0){
            int idx = 0;
            int flag = 0;
            if(num >= 900 && num < 1000){
                str += "CM";
                num -= 900;
                flag = 1;
            } else if(num >= 400 && num < 500){
                str += "CD";
                num -= 400;
                flag = 1;
            } else if(num >= 90 && num < 100){
                str += "XC";
                num -= 90;
                flag = 1;
            } else if(num >= 40 && num < 50){
                str += "XL";
                num -= 40;
                flag = 1;
            } else if(num >= 9 && num < 10){
                str += "IX";
                num -= 9;
                flag = 1;
            } else if(num >= 4 && num < 5){
                str += "IV";
                num -= 4;
                flag = 1;
            } else {
            for(int i = 0; i < arr1.size() - 1; i++){
                if(arr1.get(6) <= num){
                    idx = 6;
                    break;
                }
                if(arr1.get(i+1) > num){
                    idx = i;
                    break;
                }
            }}
            if(flag == 0){
                str += arr2.get(idx);
                num -= arr1.get(idx);
            }
        }
        return str;
    }
}
