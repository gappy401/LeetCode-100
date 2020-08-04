class 3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = 0, n = nums.length, k = n - 1;
        if (k < 2 || nums[k] < 0) {
            return res;
        }
        while (i < n - 2) {
            if (nums[i] > 0) { //// no negative number to nutralize positive break
                break;
            }
            int target = -nums[i];
            j = i + 1;
            k = n - 1;
            while (j < k) {
                if (nums[k] < 0)  //again all negative numbers break
                {
                    break;
                }
                if (nums[j] + nums[k] == target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j] == nums[++j]);
                    while(j < k && nums[k] == nums[--k]);
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    j++;
                }
            }
            while (i < n - 2 && nums[i] == nums[++i]); // for same i same slln so i++
        }
        return res;
    }
    public static void main(String args[])
    {
     3Sum c = new 3Sum();
     int sums[]={-3,14,3,0,6,8};
     List<List<Integer>> res=c.threeSum(sums);
     System.out.println(res);
    }
}