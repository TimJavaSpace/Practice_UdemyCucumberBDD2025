package algoritmsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class GetSetTherdNum {
    public static void main(String[] args) {


        // Jun-18 Jul-5 Jul-12+
        //        // Task-1 find third largest unique number // Use For loop ,TreeSet, List
        //        // Task-2 find third largest unique number // Use For loop HashSet, Collections method
        //        // Task-3 find third largest unique number // Use List Stream
        //        // Task-4 find third largest unique number // Use Array Stream

        int[] nums =new int[]{2,3,4,5,77,5,88,44,88};


        // Treeset Hashset Linkedset
        // List
        // HashMap
        // Array

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println(set);

        ArrayList<Integer> list = new ArrayList<>(set);
        System.out.println(list);

        System.out.println(list.get(list.size()-3));


















//      ==========   // Task-1  find the third largest unique number in a list of integers ==========
//        int[] nums =new int[]{2,3,4,5,77,5,88,44};
//
//        // remove duplicates
//        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
//        for (int num: nums){
//            set.add(num);
//        }
//        // to get 3d number
//        List<Integer> list = new ArrayList<>(set);
//        System.out.println(list.get(2));
    }
}


////      ==========   // Task-3 find third largest unique number // Use Stream to find the third largest unique number ==========
//int[] nums =new int[]{2,3,4,5,77,5,88,44};
//
//List<Integer> list  = new ArrayList<>();
//        for (int num: nums){
//        list.add(num);
//        }
//
//List<Integer> reversedList = list.stream()
//        .sorted(Comparator
//                .reverseOrder()).
//        collect(Collectors.toList());
//
//        System.out.println(list);
//        System.out.println(reversedList);



//     ==========   // Task-4 find third largest unique number // Use Array Stream ===============

//        int[] nums =new int[]{2,3,4,5,77,5,88,44};
//
//        List<Integer> sortedDescList = Arrays.stream(nums)
//                .boxed()  // Convert int to Integer
//                .sorted(Comparator.reverseOrder())  // Sort in descending order
//                .collect(Collectors.toList());  // Collect into a List
//
//        System.out.println(sortedDescList);

