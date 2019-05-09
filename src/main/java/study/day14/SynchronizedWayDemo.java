package study.day14;

public class SynchronizedWayDemo {
    public static void main(String[] args) {
        //创建三个线程吃苹果
        Apple2 apple = new Apple2();
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();
    }

}

class Apple2 implements Runnable {
    private int num = 50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            test();
        }
    }

    synchronized private void test() {
        if (num > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "吃了编号为" + num-- + "的苹果!");
        }
    }
}