import java.util.* ;
import java.io.*; 
public class shipPackages {
    public static int leastWeightCapacity(int[] weights, int d) {
        // Write your code here.
        int max=Integer.MIN_VALUE,sum=0;
        for(int i:weights)
        { 
            max = Math.max(i,max); 
            sum = sum + i ; 
        }
        int low = max ,high = sum,noOfDays; 
        while (low <= high) {
            int mid = (low + high) / 2;
            int numberOfDays = days(weights, mid);
            if (numberOfDays <= d) {
                //eliminate right half
                high = mid - 1;
            } else {
                //eliminate left half
                low = mid + 1;
            }
        }
        return low;

        
    }
    static int days(int weights[],int capacity)
    { 
          int days = 1; //First day.
        int load = 0;
        int n = weights.length; //size of array.
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > capacity) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }
}