
/**
 * Write a description of class JumpGameII here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JumpGameII
{
    class Solution {
        public int jump(int[] nums) 
        {
            int totalJumps=0;
            int destination=nums.length-1; //last Index
            int coverage=0 ,lastJumpIdx=0;

            //base case
            if(nums.length == 1) return 0;

            // Greedy strategy: extend coverage as long as possible
            for(int i=0;i<nums.length;i++)
            {
                coverage = Math.max(coverage,i+nums[i]);

                if(i==lastJumpIdx)
                {
                    lastJumpIdx = coverage;
                    totalJumps++;
                    if(coverage >= destination)
                    {
                        return totalJumps;
                    }

                }
            }
            return totalJumps;
        }

    }
}