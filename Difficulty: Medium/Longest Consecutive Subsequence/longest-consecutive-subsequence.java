class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        int longest = 1;
        
        for(int ele : arr) {
            hs.add(ele);
        }
         
        for(int ele : arr) {
            hs.add(ele);
        }
        
        for(int ele : hs){
            if(!hs.contains(ele-1)) {
                int count = 1;
                int current = ele;
                while(hs.contains(current + 1)) {
                    count++;
                    current++;
                }
                
                longest = Math.max(longest,count);
            }
           
        }
        
        return longest;
    }
}