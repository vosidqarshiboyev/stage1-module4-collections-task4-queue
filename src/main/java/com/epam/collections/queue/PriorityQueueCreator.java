package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String>allWords=new ArrayList<>();
        allWords.addAll(firstList);
        allWords.addAll(secondList);
        List<String>upperLetters=allWords.stream().filter(soz->Character.isUpperCase(soz.charAt(0)))
                .collect(Collectors.toList());
        List<String>lowerLetters=allWords.stream().filter(soz->Character.isLowerCase(soz.charAt(0)))
                .collect(Collectors.toList());
        lowerLetters.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        upperLetters.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        List<String>hey=new ArrayList<>();
        hey.addAll(lowerLetters);
        hey.addAll(upperLetters);
        System.out.println(hey);
        PriorityQueue<String >result=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        result.addAll(hey);
        System.out.println(result);
        return result;


    }
}
