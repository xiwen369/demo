package study.day15;

public class App {
    public static void main(String[] args) {
        //创建生产者和消费者共同的资源对象
        ShareResource resource = new ShareResource();
        //启动生产者线程
        new Thread(new Producer(resource)).start();
        new Thread(new Producer(resource)).start();
        //启动消费者线程
        new Thread(new Consumer(resource)).start();
        new Thread(new Consumer(resource)).start();
    }
}
