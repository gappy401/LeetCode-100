import java.util.*;
public class Duplicate {
public boolean containsDup(int[] nums) {
    Set<Integer> set = new HashSet<>(nums.length);
    for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
}
    public static void main(String args[])
    {
        Duplicate c = new Duplicate();
        int sums[]={0,1,12,3,5,6,89};
      
        System.out.println(c.containsDup(sums));
    }
}