class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1;
    
        // Calculate the sum of array elements
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
    
        // Use long for expected sum to avoid overflow
        long expSum = n * (n + 1) / 2;
    
        // Return the missing number
        return (int)(expSum - sum);
        
        // //using gauss
        // long sum =0;
        // long natSum = 0;
        
        
        // //calculating the sum of ele
        // for(int i=0;i<arr.length;i++) {
        //     sum+=arr[i];
        // }
        // //formula:-n*(n+1)/2 where n = length + 1
        // natSum = ((arr.length + 1)*(arr.length+2)) / 2;
        
        // return (int)(natSum - sum);
    }
}