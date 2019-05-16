package study.day18;

import java.util.HashMap;

//Map案例(计算字符串中的每一个字符出现的次数)
public class MapTest {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
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
