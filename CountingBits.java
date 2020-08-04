class CountingBits {
    public int[] countBits(int num) {
      
        int ans[]=new int[num+1];
        for(int i=1;i<=num;i++){
            ans[i]=ans[i & (i-1)] + 1; //anding i and i-1 checks how far to the power to two we have to go to add +1
        }
        return ans;
    
        
    }
      public static void main(String args[])
    {
       CountingBits c = new CountingBits();
        int num=10;
        int arr[]new int[num+1];
        arr=c.countBits(num);
    }
}