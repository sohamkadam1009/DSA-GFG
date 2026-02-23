class Solution {

    void mergeSort(int arr[], int low, int high) {
        // code here
        //base condition
        if(low >= high) return;
        //calculate the mid by this way becase sometimes the calculated mid integer value passes the int size
        int mid = low + (high - low) / 2;
        
        
        //divide and sort left half and right half and then merge 
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        
        merge(arr,low,mid,high);
        
    }
    
    void merge(int[] arr, int low, int mid, int high) {
        
        int[] temp = new int[high-low + 1];
        int index = 0;
        int left = low, right = mid+1;
        
        while(left <= mid && right <= high) {
            if(arr[left] < arr[right]) {
                //if the element from the left array is less than the element on the right array then
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }
        
        //remaining element from the left array
        while(left <= mid) {
            temp[index++] = arr[left++];
        }
        
        //remaining element from the right array
        while(right <= high) {
            temp[index++] = arr[right++];
        }
        
        //copy the elements of the temp to the original one
        for(int i=0;i<temp.length;i++) {
            arr[low+i] = temp[i];
        }
    }
}
