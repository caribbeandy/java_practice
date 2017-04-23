import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    /**
     * @param nums an array with positive and negative numbers
     * @param k an integer
     * @return the maximum average
     */
    public static double maxAverage(int[] nums, int k) {
        // Write your code here
        
        if (k > nums.length)
            return 0;
        
        LinkedList<Double> list = new LinkedList<>();

        double currSum = 0;
        for(int i=0; i<k; i++) {
            list.add((double)nums[i]);
            currSum+=nums[i];
        }
        
        double currAvg = currSum/k;
        System.out.println(currAvg);

        for(int i=k; i<nums.length; i++) {

        System.out.println(currAvg);
            
            currSum -= list.pollFirst();
            currSum += (double)nums[i];
            
            
            list.add((double)nums[i]);
        
            if (currSum/k > currAvg)
                currAvg = currSum/k;
        
        }
        
        return currAvg;
    }


    public static void main(String [] args) {
        int [] a = new int[] {-1,-2,-3,-100,-1,-50};
        int b = 4;
        System.out.println(maxAverage(a,b));
    }
}
