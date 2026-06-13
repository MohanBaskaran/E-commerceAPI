package com.mohancode.cart.Interviewprep;

import java.util.*;

/*
Input 1:
A = [1, 2, 3, 4, 5, 4]
B = [5, 4, 2]
Output 1:
[5, 4, 4, 2, 1, 3]
* */
public class Sort_Array_Order {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> B=new ArrayList<>(Arrays.asList(5, 4, 2));
       System.out.println(Arrays.toString(solve(A,B).toArray()));
        //solve(A,B);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : A) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : B) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                while (count > 0) {
                    result.add(num);
                    count--;
                }
                map.remove(num);
            }
        }
        ArrayList<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            while (count > 0) {
                remaining.add(entry.getKey());
                count--;
            }
        }
        Collections.sort(remaining);
        result.addAll(remaining);
        return result;
    }
}
