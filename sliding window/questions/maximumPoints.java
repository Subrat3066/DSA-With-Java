//Maximum points you can obtain from the  card

public class maximumPoints{
    public static void main(String[] args)
    {
        int[] nums = {2,1,3,5,7,9};
        System.out.print(solution(nums , 4));
    }
    public static int solution(int[]nums , int k)
    {
        int lSum = 0, maxSum = 0 , rIndex = nums.length-1;

        for(int i = 0 ; i < k ; i++)
        {
            lSum += nums[i];
        }
        maxSum = lSum;

        for(int i = k-1 ; i >= 0 ; i--)
        {
            lSum -= nums[i];
            lSum += nums[rIndex--];
            maxSum = Math.max(maxSum , lSum);
        }
        return maxSum;
    }

}