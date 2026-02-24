class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low < high) {
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex - 1);
            quickSort(arr,partitionIndex + 1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot = arr[low]; //taking pivot as first element from the array
        int i=low;
        int j=high;
        
        while(i<j) {
            
            while(arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            
            while(arr[j] > pivot && j >= low + 1) {
                j--;
            }
            
            //swap if the i<j
            if(i < j) swap(arr,i,j);
            
        }
        
        //place the pivot element to its correct position by swapping it with the j-th[partioned index] index element
        swap(arr,low,j);
        //return the partitioned index
        return j;
    }
    
    public void swap(int arr[], int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}