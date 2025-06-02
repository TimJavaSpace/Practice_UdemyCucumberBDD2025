package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {


        /* Task: ArrayList
        Declare – set type, name
        Create object (allocate memory)
        Declare and initialize together
        Add elements (initialize values)
        Set value at index
        Get index/value
        Remove value (by index/value)
        Check if contains element
        Compare two lists
        Get size
        Print list
        Clear list

        Sort list
        Reverse list
         */



        /*  Task Array
        Declare - set Type, name
        allocate memory
        Initialize - Set value
        Declare and Initialize
        set
        get
        Fill value
        Sort
        Compare
        Get length
        Print
         */

        int[] num;
        num = new int[4];
        num = new int[]{1, 22, 3};
        int[] nums = {1, 2, 3};
        num[0] = 2;
        Arrays.sort(num);

        boolean eq = Arrays.equals(num, nums);
        System.out.println(Arrays.toString(num));
        System.out.println(num.length);



/*
        ArrayList<Integer> nums;
        nums = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> num = new ArrayList<>(List.of(1,2,3));
        num.add(4);
        num.set(0,22);
        num.remove(1);
        int first = num.get(0);
        int s = num.indexOf(22);
        System.out.println(num.contains(4));
        System.out.println(num.equals(nums));
        System.out.println(num.size());
        System.out.println(num);

        Collections.sort(num);
        Collections.reverse(num);

 */
    }
}
