class RotateMin {
    public int findMin(int[] nums) {
        if (nums.length == 1) 
          {
            return nums[0];
           }
         int left = 0, right = nums.length - 1;
        if (nums[right] > nums[0]) 
        {
            return nums[0];
          }   
        while(left<=right)
    {
           int mid = left+ (right-left) /2;
             if (nums[mid] > nums[mid + 1]) 
             {
                return nums[mid + 1];
             }

      // if the mid element is lesser than its previous element then mid element is the smallest
      if (nums[mid - 1] > nums[mid]) 
      {
        return nums[mid];
      }
      if (nums[mid] > nums[0]) 
      {
        left = mid + 1;
      } else {
        // if nums[0] is greater than the mid value then this means the smallest value is somewhere to
        // the left
        right = mid - 1;
      }
            
    }
        return -1;
        
    }
      public static void main(String args[])
    {
       RotateMin c = new RotateMin();
        int sums[]={13,14,3,5,6,8};
        int arr=c.findMin(sums);
        
        System.out.println(arr);
    }
}