class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    result.add(List.of(nums[i], nums[l], nums[r]));
                    // go to next unique l and r
                    while (l < r && nums[l + 1] == nums[l]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
                else if (sum > 0) r--;
                else l++;
            }    
        }
        return result;
    }
}