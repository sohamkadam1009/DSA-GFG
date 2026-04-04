class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        //returning high 
        return binarySearch(arr, x, 0, arr.length-1);
        
    }
    
    public int binarySearch(int nums[], int target, int low, int high) {
        if(low<=high) {
            int mid = low + (high-low) / 2;
            
            if(nums[mid] <= target) {
                //update the low
                return binarySearch(nums, target, mid+1, high);
            }
            return binarySearch(nums, target,low,mid-1);
        }
        return high;
    }
}
