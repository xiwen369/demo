package study.day14;

//使用匿名内部类创建并启动线程
public class ThreadInnerClassDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            System.out.println("打游戏!" + i);
            if (i == 1) {
                //用thread类创建匿名内部类线程对象,并启动线程
                new Thread() {
                    public void run() {
                        for (int j = 0; j < 500; j++) {
                            System.out.println("打豆豆!" + j);
                        }
                    }
                }.start();
            }
        }
    }

    public void test() {
        for (int i = 0; i < 500; i++) {
            System.out.println("打游戏!" + i);
            if (i == 1) {
                //用接口创建内部类线程对象,并启动线程
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int j = 0; j < 500; j++) {
                            System.out.println("看电影!" + j);
                        }
                    }
                }).start();
            }
        }
    }

    ;

}
