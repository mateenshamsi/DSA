package BS1d;

public class lowerbound {
    public static int lowerBound(int []arr, int n, int x) {
        // Write your code here
        int low = 0 , high=n-1,ans=0,mid ;
        if(arr[0]>x)
        { 
            return 0 ; 
        }
        if(arr[n-1]<x)
        { 
            return n ; 
        }
        while(low<=high)
        {   mid = (low+high)/2 ; 
            if(arr[mid]>=x)
            { 
                ans = mid ; 
                high=mid-1 ; 
            }
            else 
            { 
                low=mid+1; 

            }
        }
        return ans ; 

    }
}