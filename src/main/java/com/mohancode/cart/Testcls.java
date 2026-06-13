package com.mohancode.cart;

import org.w3c.dom.css.Counter;

import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Testcls {


    public static void main(String[] args) {
        // List<String> str= Arrays.asList("This is a Demo application".split(""));
        String str="This is a Demo application";

//    Map<Character,Integer> res=str.stream().map(n -> n!=" ", );

        Map<Character,Long> res=str.chars().filter(c -> c!=' ').mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                        .entrySet().stream().filter(entry -> entry.getValue() >=1)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

//        HashMap<Character,Integer> hm=new HashMap<>();
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)!=' ') {
//                if (hm.containsKey(str.charAt(i))) {
//                    hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
//                } else {
//                    hm.put(str.charAt(i), 1);
//                }
//            }
//        }
        System.out.println(res);
    }


}
