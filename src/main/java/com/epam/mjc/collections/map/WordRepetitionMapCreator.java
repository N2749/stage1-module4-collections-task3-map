package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        String[] words = sentence.split("[,.]* +|[,.]");
        if (words[0].isEmpty()) return result;
        for (String word : words) {
            int count = result.getOrDefault(word.toLowerCase(), 0);
            result.put(word.toLowerCase(), ++count);
        }
        return result;
    }

    public static void main(String[] args) {
        WordRepetitionMapCreator main = new WordRepetitionMapCreator();
        main.createWordRepetitionMap("").forEach((s, integer) -> System.out.println(s + " " + integer));
    }
}
