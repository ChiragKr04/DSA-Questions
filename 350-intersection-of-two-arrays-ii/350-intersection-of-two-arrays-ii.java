class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
            
            if(map.containsKey(nums1[i])){
                int val = map.get(nums1[i]);
                map.put(nums1[i],val+1);
            }else{
                map.put(nums1[i],1);    
            }
        }
        
        for(int x:nums2){
            if(map.containsKey(x) && map.get(x) > 0){
                ans.add(x);
                map.put(x,map.get(x)-1);
            }
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}