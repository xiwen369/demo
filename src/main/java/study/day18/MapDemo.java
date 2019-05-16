package study.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//map的迭代
public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("key1", "v1");
        map.put("key2", "v2");
        map.put("key3", "v3");
        map.put("key4", "v4");
        map.put("key5", "v5");
        map.put("key6", "v6");
        System.out.println(map);
        //获取key的set集合,然后迭代set集合即可
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }
        System.out.println("----------------------");
        //获取value的set集合,然后迭代set集合即可
        Collection<Object> values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("----------------------");
        //获取map中的所有的entry
        Set<Map.Entry<String, Object>> entries = map.entrySet();
        for (Map.Entry<String, Object> entry:entries) {
            System.out.println(entry.getKey()+"<->"+entry.getValue());
        }

    }
}
