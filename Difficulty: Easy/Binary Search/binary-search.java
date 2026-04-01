class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int left = 0, right = arr.length -1;
        
        while(left<=right) {
            int mid = left + (right - left) / 2;
            
            if(arr[mid] == k) {
                while(mid > 0 && arr[mid-1] == arr[mid]) {
                    mid -=1;
                }
                return mid; //target found;
                
            } else if(arr[mid] < k) {
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        
        //target not found
        return -1;
    }
}