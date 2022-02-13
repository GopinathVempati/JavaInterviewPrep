package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Tesla", 120);
        hashMap.put("Honda", 100);
        hashMap.put("Toyota", 110);
        hashMap.put("BMW", 130);
        hashMap.put("Maruti", 150);
       /* hashMap.putIfAbsent("BMW",140);
        System.out.println(hashMap.get("Munna"));
        System.out.println(hashMap.containsKey("Honda"));
        System.out.println(hashMap.containsKey("agds"));
        System.out.println(hashMap.containsValue(100));*/
        /*Iteraition in maps*/
        /*Set<String> keySet = hashMap.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }*/
        /*Entry set hashmap*/
        hashMap.remove("Maruti",150);
        Set<Map.Entry<String,Integer>> entrySet = hashMap.entrySet();

        for (Map.Entry<String,Integer> map : entrySet){
            System.out.println(map.getKey() +" : "+map.getValue());
        }

        /*Remove in HashMap*/

    }
}
