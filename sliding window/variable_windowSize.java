//Find the length of longest subarray which sum is smaller than or equal to the k


public class variable_windowSize{
    public static void main(String[] args)
    {
        int[] nums = {2,5,1,10,10,7,2,1,4};
        System.out.print(variableWindow(nums , 14));
    }

    public static int variableWindow(int[]nums , int k)
    {
        int l = 0 , r = 0;
        int sum = 0 , maxLen = 0;

        while(r < nums.length )
        {
            sum += nums[r];
            if(sum > k)
            {
                sum -= nums[l++];
            }
            if(sum <= k)
            {
                maxLen = Math.max(maxLen , r-l+1);
            }
            r = r+1;
        }
        return maxLen;
    }
}