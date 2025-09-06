//Find the max sum between all possible subarrays of length k in nums

public class constant_sw{
    public static void main(String[] args)
    {
        int[] nums = {100,4,5,3000,6,80,9};
        System.out.print(constantWindow(nums , 3));
    }
    public static int constant(int[]nums , int k)
    {
        int l = 0 , r = 0;
        int sum = 0;

        while(r < k)sum+=nums[r++];
        int maxSum = sum;

        while(r<nums.length-1)
        {
            sum -= nums[l++];
            r++;
            sum+= nums[r];
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }
    public static int constantWindow(int[]nums , int k)
    {
		int left = 0;
		int right = 0;
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		while(right<nums.length) 
        {
			sum = sum + nums[right++];
			if(right-left == k) 
            {
				maxSum = Math.max(maxSum , sum);
				sum = sum - nums[left++];
            }
        }
        return maxSum;
    }
}