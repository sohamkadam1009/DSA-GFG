class Solution {
    public int nthRoot(int n, int m) {
        
        //base condition 0's nth root will be 0 only means x^n = 0
        if(m==0) return 0;
        
        // code here
        int low = 1, high = m;
        
        
        while(low<=high) {
            int mid = low + (high - low) / 2;
              long ans = 1;
            for(int i=1;i<=n;i++) {
                ans *= mid;
                if(ans > m) break;
            }
            
            if(ans == m) {
                return mid;
            }
            
            if(ans < m) {
                low = mid+1; 
            } else {
                high = mid -1;
            }
        }
        
        return -1;
    }
}