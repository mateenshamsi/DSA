import java.util.ArrayList;
class kthElement{
public class Solution {
    public static int kthElement(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int k) {
        // Write your coder here
       int mergedArr[] = new int[arr1.size()+arr2.size()] ; 
       merge(arr1,arr2,mergedArr) ; 
       return mergedArr[k-1] ; 
          
    }
     
    public static int[] merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2,int mergedArr[])
    { 
        int  i = 0, j=0 ;
        int k=0 ; 
        while(i<arr1.size()&&j<arr2.size())
        { 
            if(arr1.get(i)>arr2.get(j))
            { 
                mergedArr[k] = arr2.get(j) ; 
                j++;
            }
            else
            { 

                mergedArr[k] = arr1.get(i); 
                i++;
            } 
            k++ ; 
        }
        while(i<arr1.size())
        { 
            mergedArr[k] = arr1.get(i) ; 
            i++ ; 
            k++ ; 
        }
        while(j<arr2.size())
        { 
            mergedArr[k] = arr2.get(j) ; 
            j++ ; 
            k++ ; 
        }
    return mergedArr ;  
    }
}
}