class Water {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
     public static void main(String args[])
    {
     Water c = new Water();
     int sums[]={2,14,3,1,6,8};
     
     int res=c.maxArea(sums);
     System.out.println(res);
    }
        
    
}