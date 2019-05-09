package study.day15;

public class ShareResource {
    private String name;
    private String gender;
    boolean isEmpty = true;

    /**
     * 生产者向对象中储存数据
     */
    synchronized public void push(String name, String gender) {
        try {
            while (!isEmpty) {//当前isEmpty为false的时候,不空,等着消费者来采取!
                //使用同步锁对象来调用,表示当前线程释放同步锁,进入等待池,只能被其他线程所唤醒
                this.wait();
            }
            //生产开始
            this.name = name;
            this.gender = gender;
            //生产结束
            isEmpty = false;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 消费者从共享资源对象中取出数据
     */
    synchronized public void popup() {
        try {
            while (isEmpty) {//当isEmpty为true的时候，为空，等着生产者生产
                //使用同步锁对象来调用，表示当前线程释放同步锁，进如等待池，只能被其他线程所唤醒
                this.wait();
            }
            //进行消费
            System.out.println(this.name + "-" + this.gender);
            //进行消费
            isEmpty = true;
            this.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
