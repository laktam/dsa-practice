class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
            }else {
                set.remove(nums[i]);
            }
        }
        return set.toArray(new Integer[0])[0];
    }
}