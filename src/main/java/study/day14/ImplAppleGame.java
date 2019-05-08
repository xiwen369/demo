package study.day14;

//使用Runnable的方式来实现,三个同学吃苹果的比赛
public class ImplAppleGame {
    public static void main(String[] args) {
        //创建三个线程吃苹果
        Apple apple = new Apple();
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();
    }
}

class Apple implements Runnable {
    private int num = 50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "吃了编号为" + num-- + "的苹果!");
            }

        }

    }
}
