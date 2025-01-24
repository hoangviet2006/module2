package ss12_map_set.thuc_hanh;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;


public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Việt1",20);
        hashMap.put("Việt2",18);
        hashMap.put("Việt3",19);
        System.out.println(hashMap);
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
        System.out.println(linkedHashMap);
    }
}
