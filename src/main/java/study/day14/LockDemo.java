package study.day14;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Apple3 implements Runnable {
    private int num = 50;
    private final Lock lock = new ReentrantLock();//创建一个锁对象

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            eat();
        }
    }

    private void eat() {
        lock.lock();
        try {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "吃了编号为" + num-- + "的苹果!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();//释放锁！
        }
    }
}

public class LockDemo {
    public static void main(String[] args) {
        //创建三个线程吃苹果
        Apple3 apple = new Apple3();
        new Thread(apple, "小A").start();
        new Thread(apple, "小B").start();
        new Thread(apple, "小C").start();
    }
}
