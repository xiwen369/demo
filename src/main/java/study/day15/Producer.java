package study.day15;

public class Producer implements Runnable {
    private ShareResource resource = null;

    public Producer(ShareResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                    if (i % 2 == 0) {
                        resource.push("春哥", "男");
                    } else {
                        resource.push("凤姐", "女");
                    }
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
