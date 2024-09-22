package classWork3;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Problem {

    public static Collection<String> uniqueWords(String[] words) {

        Set<String> set = new TreeSet<>();

        for (String el : words) {
            set.add(el);
        }

        return set;
    }

    public static void main(String[] args) {

        String[] words = {
                "apple", "banana", "orange", "apple", "pear",
                "banana", "grape", "orange", "melon", "peach",
                "apple", "banana", "grape", "peach", "melon",
                "kiwi", "pear", "orange", "apple", "kiwi"
        };

        Set<String> wo = new TreeSet<String>();
        Collections.addAll(wo, words);
        System.out.println(wo);
        System.out.println(uniqueWords(words));
        System.out.println(uniqueWords(words).size());


    }
}
