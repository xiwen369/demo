package study.day14;

//方式1:继承Thread类
public class ExtendsThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println("打游戏!"+i);
            if(i==1){
                //创建线程对象,并启动线程
                MusicThread musicThread = new MusicThread();
                musicThread.start();
            }
        }
    }
}

//播放音乐的线程类
class MusicThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("播放音乐!" + i);
        }
    }
}
