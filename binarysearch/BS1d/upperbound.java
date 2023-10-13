package BS1d;

public class upperbound  {
    public static int upperBound(int []arr, int x, int n){
     
        int low = 0 , high=n-1,ans=n,mid ;
      
        while(low<=high)
        {   mid = (low+high)/2 ; 
            if(arr[mid]>x)
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