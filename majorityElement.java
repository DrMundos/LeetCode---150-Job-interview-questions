
/**
 * Write a description of class majorityElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class majorityElement
{
    public int majorityElement(int[] nums)
    {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if(num == candidate)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        return candidate;
    }

}