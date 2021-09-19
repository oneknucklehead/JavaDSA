public class HowManyNumbersAreSmallerThantheCurrentNumber {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            //Since the question mentions nums[i] to be within 0 to 100, we are safe to take a new array of size 101.
            int a[]=new int[101];
            int sum=0;

            //Count the frequency of each element
            for(int i=0;i<nums.length;i++)
            {
                a[nums[i]]++;
            }

            for(int i=0;i<101;i++)
            {
                //Add the curent frequency to a sum because this number and all the prev numbers will be smaller than the numbers we see ahead.
                sum+=a[i];
                // Since the current number was also added to the sum, subtract it and update a[i] with the count of number which is smaller than the current number
                a[i]=sum-a[i];
            }
            //We can update the original array itself and return
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=a[nums[i]];
            }
            return nums ;
        }
    }
}
