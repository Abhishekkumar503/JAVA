package LeetCode.Array.Easy;

public class MergeSortedArray_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

public void merge(int[] nums1, int m, int[] nums2, int n) {
	int i=0, j=0, k=0;

    int[] ans = new int[n+m];
   
       while(i < nums1.length || j < nums2.length || k < n+m) 
       {
           if(nums1[i]==0)
           i++;
           
           else if(nums2[j]==0) 
           j++;

           if(nums1[i] < nums2[j])
           {
               ans[k] = nums1[i];
               i++;
           }
           else
           {
               ans[k] = nums2[j];
               j++;
           }
           k++;
       }
    }
}
