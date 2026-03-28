class Solution {
    int maxLength(int arr[]) {
        // code here
        //using hashmap to store the sum and index map = {sum,index}
        
        // prefixSum[i] - prefixSum[j] = 0
        // if prefixSum[i] == prefixSum[j]
        // then subarray from (j+1 to i) has sum 0
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int currentSum = 0;
        int length = 0,maxLength = 0;
        
        for(int i=0;i<arr.length;i++) {
            currentSum+=arr[i];
            if(currentSum == 0) {
                maxLength = i + 1;
            }
            if(map.containsKey(currentSum)){ //if currentSum already exists in map then update the maxlength
                length = i - map.get(currentSum);
                maxLength = Math.max(length,maxLength);
            } else {
                map.put(currentSum,i); //store the currrentSum and its index in hashmap 
            }
            
        }
        
        return maxLength;
    }
}