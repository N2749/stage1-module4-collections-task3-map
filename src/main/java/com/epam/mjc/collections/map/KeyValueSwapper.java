package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        sourceMap.forEach((integer, s) -> {
            if (!result.containsKey(s) || result.get(s) > integer)
                result.put(s, integer);
        });
        return result;
    }
}
