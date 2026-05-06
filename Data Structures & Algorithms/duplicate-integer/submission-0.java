class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer num:nums){
            if(map.containsKey(num))
            return true;
            map.put(num,1);
        }
        return false;
    }
}