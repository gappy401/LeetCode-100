import java.util.*;
class SumArr {
   public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
   }
    public static void main(String args[])
    {
        SumArr c = new SumArr();
        int sums[]={0,1,12,34,5,6,89};
        int arr[]=new int[2];
        arr=c.twoSum(sums,200);
        System.out.println(arr[0]+" "+arr[1]);
    }
}