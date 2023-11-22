class MedianOfTwoSortedArrays{
public class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int  mergedArr[] = new int[nums1.length+nums2.length] ; 
       merge(nums1,nums2, mergedArr ) ; 
       int index = (mergedArr.length)/2 ; 
       if(mergedArr.length%2==0)
       { 
           return ((double)(mergedArr[index]+(double) mergedArr[index-1]))/2 ;   
       }
       else
       { 
           return mergedArr[mergedArr.length/2] ; 
       }
    }
    public int[] merge(int nums1[],int nums2[],int mergedArr[])
    { 
        int  i = 0, j=0 ;
        int k=0 ; 
        while(i<nums1.length&&j<nums2.length)
        { 
            if(nums1[i]>nums2[j])
            { 
                mergedArr[k] = nums2[j] ; 
                j++;
            }
            else
            { 

            mergedArr[k] = nums1[i] ; 
                i++;
            } 
            k++ ; 
        }
        while(i<nums1.length)
        { 
            mergedArr[k] = nums1[i] ; 
            i++ ; 
            k++ ; 
        }
        while(j<nums2.length)
        { 
            mergedArr[k] = nums2[j] ; 
            j++ ; 
            k++ ; 
        }
    return mergedArr ;  
    }
} 

}