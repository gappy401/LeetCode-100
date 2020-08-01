class Product {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] L = new int[length];
        int[] R = new int[length];
        int[] answer = new int[length];
        L[0] = 1;
        for (int i = 1; i < length; i++) {

            // L[i - 1] already contains the product of elements to the left of 'i - 1'
            L[i] = nums[i - 1] * L[i - 1];
        }

        // R[i] contains the product of all the elements to the right
        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {

            R[i] = nums[i + 1] * R[i + 1];
        }

        // Constructing the answer array
        for (int i = 0; i < length; i++) {
            // For the first element, R[i] would be product except self
            // For the last element of the array, product except self would be L[i]
            // Else, multiple product of all elements to the left and to the right
            answer[i] = L[i] * R[i];
        }

        return answer;
    }
     public static void main(String args[])
    {
       Product c = new Product();
        int sums[]={1,12,34,5,6,8};
        int arr []=c.productExceptSelf(sums);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
}