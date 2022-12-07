public class Solution {
    public ArrayList<Integer> repeatedNumber( List<Integer> A) {
      HashMap<Integer, Integer> map = new HashMap<>();
      ArrayList<Integer> ans=new ArrayList<>();
        int i;
        int n=A.size();
        for(i=1;i<=n;i++){
            map.put(i,0);
        }
        for(i=0;i<n;i++){
            map.replace(A.get(i),map.get(A.get(i))+1);
        }
        int a=0,b=0;
        for(i=1;i<=n;i++){
            if(map.get(i)>1){
               a= i;
            }
            if(map.get(i)==0){
                b=i;
            }
        }
       ans.add(a);
       ans.add(b);
        return ans;
       
    }
}
