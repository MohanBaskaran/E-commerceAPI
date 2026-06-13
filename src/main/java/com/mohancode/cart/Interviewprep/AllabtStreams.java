package com.mohancode.cart.Interviewprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AllabtStreams {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList( 5,12,7,20,3,12);
        List<Integer> res=list.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(res);
        List<String> strlist=Arrays.asList("GOOD EVENING".split(""));
        System.out.println(strlist);
        Map<String, Long> strstream=strlist.stream().filter(ch -> !ch.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

        System.out.println(strstream);

    }
}
