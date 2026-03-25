class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n=nums.length; 
       Arrays.sort(nums);
       List <List<Integer>> res = new ArrayList<>();

       for(int i=0;i<n;i++){
        if(i>0 && nums[i-1]==nums[i]){
            continue;
        }
        int l=i+1;
        int r=n-1;

        while(l<r){
            int tsum=nums[i]+nums[r]+nums[l];
            if(tsum>0){
                r--;
            }else if(tsum<0){
                l++;
            }else{
                res.add(Arrays.asList(nums[i],nums[r],nums[l]));
                l++;
                r--;
                while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
            }
        }
       }
       return res;
    }
}
