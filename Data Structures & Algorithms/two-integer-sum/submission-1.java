
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] k=new int[2];
        int fl=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    k[0]=i;
                    k[1]=j;
                    fl=1;
                    break;
                }
                if(fl==1) break;
            }
        }
        Arrays.sort(k);
        return k;
    }
}
