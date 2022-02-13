import java.util.*;

public class Unicorn {
    public static void main(String[] args) {
      String[] array = {"abc","2","10","0"};
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(Arrays.toString(array));
        Map<String,Integer> map = new HashMap<>();
        map.put("guitar",1200);
        map.put("cello",1200);
        map.put("drum",1200);
        map.put("cello",1100);
        int a = map.get("cello");
        System.out.println(map.size());
    }


    public static int square(int x) {
        return x * x;
    }
}

