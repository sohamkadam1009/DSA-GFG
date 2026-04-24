class Solution {
    int floorSqrt(int n) {
        // code here
        //using binary search to solve this example 
        //we know that the square root of any number n lies in between 1 to n/2
        
        //handing the base case
        if(n<=2) return 1;
        int low = 1, high = n/2;
        int squareRoot = 0;
        while(low<=high) {
            int mid = low + (high-low)/2;
            
            if(mid*mid <= n) { //less than becasue we wrere returning floor value for the non perfect squares
                ///update the squareRoot
                squareRoot = mid;
                //move the boundries
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return squareRoot;
    }
}