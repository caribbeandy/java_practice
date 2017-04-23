import java.util.Arrays;
class Reverse {


    public static void rotate(int [] nums, int k) {

        k = k%nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int [] nums, int start, int end) {

        while(start<end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }


    public static void main(String [] args) {

        System.out.println(2%0);
    }
}
