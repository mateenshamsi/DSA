public class kthMissingNumber {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
           int low =0,high=arr.length-1 ;
           if(arr[0]>1 && k==1)
           { 
               return 1 ; 
           }
           while(low<=high)
           { 
               int mid=(low+high)/2 ; 
               int missing = noOfMiss(arr,mid) ;
               if(missing<k)
               { 
                   low= mid+1; 
               } 
               else
               { 
                   high = mid-1;  
               }
           } 
           return k+high+1  ; 
        }
        public static int noOfMiss(int arr[],int mid)
        { 
            int ans = arr[mid] - (mid+1) ; 
            return ans ; 
        }
    }    
}
