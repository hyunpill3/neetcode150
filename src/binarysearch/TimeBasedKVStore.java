package binarysearch;

import java.util.*;
// import org.javatuples.Pair;


// Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.

// Implement the TimeMap class:

// TimeMap() Initializes the object of the data structure.
// void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
// String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
public class TimeBasedKVStore {
    Map<String, List<Map.Entry<String, Integer>>> map;
    public TimeBasedKVStore() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) map.put(key, new ArrayList<>());
        map.get(key).add(new AbstractMap.SimpleEntry<String, Integer>(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        List<Map.Entry<String, Integer>> list = map.get(key);
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int mid = l + (r - l + 1) / 2;
            int val = list.get(mid).getValue();
            if (val <= timestamp) l = mid;
            else r = mid - 1;
        }
        return list.get(l).getValue() <= timestamp
            ? list.get(l).getKey()
            : "";
    }
}
