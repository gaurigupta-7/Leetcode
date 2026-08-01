class Solution {
    public int pivotIndex(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            int suml=0,sumr=0;
            for(j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(j<i)
                        suml=suml+nums[j];
                    if(i<j)
                        sumr=sumr+nums[j];
                }
            }
            if(suml==sumr)
            {
                return i;
            }
        }
    return -1;
    }
}