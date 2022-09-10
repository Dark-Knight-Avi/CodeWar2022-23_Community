class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = a[0];
        long max = a[0];
        for(int i = 1; i < a.length; i++){
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        pair p = new pair(min, max);
        return p;
    }
}
