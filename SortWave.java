// Java implementation of naive method for sorting
// an array in wave form.
import java.util.*;
 
class SortWave
{
    // A utility method to swap two numbers.
    static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /*
The time complexity of the above solution is O(nLogn) if a O(nLogn) sorting algorithm like Merge Sort, Heap Sort, .. etc is used.

This can be done in O(n) time by doing a single traversal of given array. The idea is based on the fact that if we make sure that all even positioned (at index 0, 2, 4, ..) elements are greater than their adjacent odd elements, we don’t need to worry about odd positioned element. Following are simple steps.
1) Traverse all even positioned elements of input array, and do following.
….a) If current element is smaller than previous odd element, swap previous and current.
….b) If current element is smaller than next odd element, swap next and current.

    */
 
    // This function sorts arr[0..n-1] in wave form, i.e.,
    // arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
    static void sortInWave(int arr[], int n)
    {
        // Sort the input array
        Arrays.sort(arr);
 
        // Swap adjacent elements
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
 
    // Driver method
    public static void main(String args[])
    {
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
/*This code is contributed by Rajat Mishra*/
