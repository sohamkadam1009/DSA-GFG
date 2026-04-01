class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        
        if(target > arr[arr.length-1]) { //return last index as lower bound
            return arr.length;
        }
        
        int lowerbound = Integer.MAX_VALUE;
        
        return returnLowerBound(arr, 0, arr.length-1, target, lowerbound);
        
    }
    
    public int returnLowerBound(int[] arr, int low, int high, int target, int lowerbound) {
        if(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] >= target) {
                //if its greater then reduce the search space from right
                lowerbound = Math.min(lowerbound, mid);
                return returnLowerBound(arr, low, mid-1, target, lowerbound);
                // high = mid-1;
            } 
            //reduce the search space from right
            return returnLowerBound(arr, mid+1, high, target, lowerbound);
                // low = mid +1;
        }
        
        return lowerbound;
    }
}
