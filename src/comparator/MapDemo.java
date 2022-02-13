package comparator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        map.put("pos1","pos11");
//        map.put("pos2","pos22");
//        map.put("pos2","pos223");
//        map.put("pos3","pos33");
//        map.put("pos4","pos44");
//        map.put("pos5","pos55");
//        System.out.println(map);
//        for (String key : map.keySet())
//        System.out.println(key +" <-> "+map.get(key));

        Map<String,String> map = new Hashtable<>();
        map.put("pos1","pos11");
        map.put("pos2","pos22");
        map.put("pos2","pos223");
        map.put("pos3","pos33");
        map.put("pos4","pos44");
        map.put("pos5","pos55");
        System.out.println(map);
        for (String key : map.keySet())
            System.out.println(key +" <-> "+map.get(key));
    }
}
