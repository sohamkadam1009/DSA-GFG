class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length -1;
        int temp;
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<n;j++) {
                if(arr[j+1] < arr[j]) {
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            n--;
        }
    }
}