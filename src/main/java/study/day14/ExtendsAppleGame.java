package study.day14;

//使用继承Thread的方式来实现,三个同学吃苹果的比赛
public class ExtendsAppleGame {
    public static void main(String[] args) {
        new Person("小A").start();
        new Person("小B").start();
        new Person("小C").start();
    }
}

class Person extends Thread {
    private int num = 50;//苹果总数

    public Person(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            if (num > 0) {
                System.out.println(super.getName() + "吃了编号为" + num-- + "的苹果!");
            }
        }
    }
}
