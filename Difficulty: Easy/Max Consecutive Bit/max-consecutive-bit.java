class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int count=1,maxCount = 0;
        
        for(int i=0;i<arr.length - 1;i++) {
            if(arr[i]!= arr[i+1]) {
                maxCount = Math.max(maxCount,count);
                count = 1;
            } else {
                count++;
            }
        }
        
        return Math.max(maxCount,count);
    }
}
