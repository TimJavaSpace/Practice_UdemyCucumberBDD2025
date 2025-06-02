import java.util.HashMap;
import java.util.Map;
public class TwoSum {

    public static void main(String[] args) {

        //  ==  Task-1 create method use nested for loop
//        int[] res = twoSumLoop(new int[]{2, 7, 11, 15}, 17);
//        System.out.println(res[0] + ", " + res[1]);
//
//     // == Task-2 create method use HashMap return indexes of two num
//            int[] resMap = twoSumMap(new int[]{ 1, 2, 3, 4, 5, 6}, 9);
//            System.out.println(resMap[0] + ",map " + resMap[1]);
    }









    /* =========  hint =================

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return new int[]{-1,-1}; // no pair found
    }



  // == Task-2 create method use HashMap return indexes of two num
    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int needed = target - current;

            if (map.containsKey(needed)) {   // If we've already seen the needed number, return the pair of indices
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i); // Otherwise, store the current number with its index in Map
        }

        return new int[]{-1, -1};  // If no pair is found, return -1
    }

     */

}
