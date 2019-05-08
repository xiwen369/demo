package study.day14;

public class SynchronizedDemo {
    public static void main(String[] args) {
        //创建三个线程吃苹果
        Apple1 apple = new Apple1();
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();
    }
}
class Apple1 implements Runnable {
    private int num = 50;

    @Override
    public void run() {
            for (int i = 0; i < 50; i++) {
                synchronized (this){
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "吃了编号为" + num-- + "的苹果!");
                }
            }
        }
    }
}
