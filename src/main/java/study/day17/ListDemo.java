package study.day17;

import java.util.ArrayList;
import java.util.Iterator;

//集合的迭代操作
public class ListDemo {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        System.out.println(arr);
        //1.for循环
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("---------------------------");
        //2.增强for循环
        for (Object ele : arr) {
            System.out.println(ele);
        }
        System.out.println("---------------------------");
        //3.迭代器
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------------");
        //4.for循环+Iterator,推荐使用这个，因为底层源码都是这么写的，效率高！
        for (Iterator it1 = arr.iterator();it1.hasNext();) {
            System.out.println(it1.next());
        }
    }

}
