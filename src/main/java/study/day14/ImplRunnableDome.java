package study.day14;

public class ImplRunnableDome {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            System.out.println("打游戏!" + i);
            if (i == 2) {
                MusicRunnable musicRunnable = new MusicRunnable();
                Thread t = new Thread(musicRunnable);
                t.start();
            }
        }
    }
}

class MusicRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("听音乐!" + i);
        }
    }
}
