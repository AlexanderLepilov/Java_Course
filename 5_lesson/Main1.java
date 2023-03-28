import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>(); // Храниться могут в любом порядке.
        Map<Integer, Integer> treeMap = new TreeMap<>(); // Сортирует ключи по порядку.
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>(); // Сортирует ключи по добавлению.

        Integer x = 5;

        // 101 =

        // [b0, b1, b2, b3, b4, b5, b6, b7, ..., b15] // bucket
        treeMap.put(1, 100);
        // key -> hash [-2^32, 2^32 - 1]
        // [Entry(key="key", hash, value=100)]

        treeMap.put(3, 200);
        // [Entry(key="key", hash, value=200)]

        treeMap.put(2, 400);
        // bucket -> [Entry(key="key", hash, value=200), Entry(key="key_2", hash,
        // value=400)]

        System.out.println(treeMap);


    }
}
