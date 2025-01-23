package com.mohancode.cart.Interviewprep;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        String str="GOOD EVENING";
//        HashMap<Character,Integer> strhas=new HashMap<Character, Integer>();;
//        for(int i=0; i<str.length();i++){
//            if(!strhas.containsKey(str.charAt(i))){
//                strhas.put(str.charAt(i),1);
//            }else {
//                strhas.put(str.charAt(i),strhas.get(str.charAt(i))+1);
//            }
//        }
//        System.out.println(strhas.toString());
        Map<Character, Long> duplicateCharacterCounts = str.chars()
                .filter(c -> c != ' ') // Exclude spaces
                .mapToObj(c -> (char) c) // Convert int stream to Character stream
                .collect(Collectors.groupingBy(
                        c -> c, // Group by character
                        Collectors.counting() // Count occurrences
                ))
                .entrySet()
                .stream() // Stream the entries of the map
                .filter(entry -> entry.getValue() >= 1) // Keep only duplicates
                .collect(Collectors.toMap(
                        Map.Entry::getKey, // Key is the character
                        Map.Entry::getValue // Value is the count
                ));

        // Print the duplicates and their counts
        duplicateCharacterCounts.forEach((character, count) ->
                System.out.println(character + "=" + count)
        );
    }
}

