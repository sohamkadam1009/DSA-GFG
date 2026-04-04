// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int minIndex = arr.length;
        return binarySearch(arr, x, 0, arr.length-1, minIndex);
    }
    
    public int binarySearch(int nums[], int target, int low, int high, int minIndex) {
        if(low<=high) {
            int mid = low + (high-low) / 2;
            if(nums[mid] >= target) {
                minIndex = Math.min(minIndex, mid);
                return binarySearch(nums, target, low, mid-1, minIndex);
            } else {
                //update the low
                return binarySearch(nums, target, mid+1, high, minIndex);
            }
                
        }
        
        if(minIndex == nums.length) return -1;
        return minIndex;
    }
}
