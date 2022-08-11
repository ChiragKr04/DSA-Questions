class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        
        int nums1Last = m-1;
        
        int nums2Last = n-1;
        
        int insertAt = m+n-1;
        
        
        while(nums2Last >= 0){
            
            if(nums1Last >= 0 && nums1[nums1Last] > nums2[nums2Last]){
                
                nums1[insertAt] = nums1[nums1Last];
                insertAt--;
                nums1Last--;
                
            }else{
                
                nums1[insertAt] = nums2[nums2Last];
                nums2Last--;
                insertAt--;
                
            }
            System.out.println(Arrays.toString(nums1) + " " + nums1Last + " " + nums2Last + " "+ insertAt);
        }
        
        
    }
}