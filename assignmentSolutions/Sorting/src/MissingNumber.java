public class MissingNumber {
    //using cyclic sort
    class Solution {
        public int missingNumber(int[] nums) {
            return findMissing(nums);

        }
        static int findMissing(int[] arr){
            int i=0;
            while(i<arr.length){
                if(arr[i]<arr.length&&arr[i]!=arr[arr[i]])
                    swap(arr,i,arr[i]);
                else
                    i++;
            }
            for(int index=0;index<arr.length;index++)
            {
                if(arr[index]!=index)
                    return index;
            }
            return arr.length;
        }
        static void swap(int[] a,int first,int second){
            int temp = a[first];
            a[first] = a[second];
            a[second] = temp;
        }
    }

//0ms, faster than 100%
//         int sum1=0;
//         int sum2=(nums.length*(nums.length+1))/2;
//         for(int i:nums){
//             sum1+=i;
//         }
//         int diff=sum2-sum1;
//         return diff;
}
