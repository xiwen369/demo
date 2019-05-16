package study.day18;

import java.util.Map;
import java.util.TreeMap;

//Map案例(计算字符串中的每一个字符出现的次数)
public class MapTest {
    public static void main(String[] args) {
//      Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map = new TreeMap<>();
        String str = "ashfjhquoewurhwehfjksdbfsjabakhfskfdhlsfh";
        char[] arr = str.toCharArray();
        System.out.println(arr);
        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
