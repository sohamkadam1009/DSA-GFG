class Solution {
    public static int largest(int[] arr) {
        // code here
        int low =0;int high = arr.length - 1;
        int max = Integer.MIN_VALUE;
        
        if(arr.length == 1) return arr[0];
        
        while(low <= high) {
            if(low == high) {
                max= Math.max(arr[low], max);
            } else {
                max= Math.max(arr[low], max);
                max = Math.max(arr[high], max);
            }
            
            low++;
            high--;
            
        }
        
        return max;
    }
}
