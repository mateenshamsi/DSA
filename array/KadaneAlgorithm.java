class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long curr=0,max=-1; 
        for(int i:arr)
        { 
            curr=curr+i ; 
            if(curr>max)
            { 
                max=curr ; 
            } 
            if(curr<0)
            { 
                curr=0;
            }
        }
        return max ; 
        
    }
    
}