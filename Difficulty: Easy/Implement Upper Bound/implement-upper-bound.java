class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int upperbound = Integer.MAX_VALUE;
        
        if(target > arr[arr.length-1]) { 
            return arr.length;
        }
        
        return returnUpperBound(arr, 0, arr.length-1, target, upperbound);
    }
    
    public int returnUpperBound(int[] arr, int low, int high, int target, int upperbound) {
        if(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] > target) {
                upperbound = mid;
                // return upperbound;
                return returnUpperBound(arr, low, mid-1, target, upperbound);
            } 
            
            return returnUpperBound(arr, mid+1, high, target, upperbound);
               
        }
        
        return upperbound;
    }
}
