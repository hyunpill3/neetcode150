package arrayshashing;

// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopFrequentEl {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(nums)
            .boxed()
            .collect(Collectors.groupingBy(x -> x))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue((o1, o2) -> Integer.compare(o2.size(), o1.size())))
            .forEachOrdered(x -> {
                if (list.size() < k) 
                    list.add(x.getKey());
            });
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
