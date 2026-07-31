class Solution {
    public int hammingWeight(int n) {
        int t=n,d,c=0;
        while(t!=0)
        {
            d=t%2;
            t=t/2;
            if((d&1)==1)
            {
                c++;
            }
        }
        return c;
    }
}