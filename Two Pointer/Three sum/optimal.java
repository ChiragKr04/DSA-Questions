class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        HashSet<List<Integer>> res = new HashSet<>();
        
        int len = nums.length;
        
        for(int i = 0; i < len; i++){
            
            int left = i + 1;
            int right = len - 1;
            
            while(left < right){
                
                int currsum = nums[i] + nums[left] + nums[right];
                
                if (currsum == 0){
                    
                    List<Integer> temp = new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right]));
                    if(res.contains(temp)==false){
                        res.add(temp);
                    }
                    left++;
                    right--;
                    
                }else if (currsum > 0){
                    
                    right--;
                    
                }else{
                    
                    left++;
                    
                }
                
            }
            
        }
        return new ArrayList<>(res);
    }
}