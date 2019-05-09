package study.day15;

public class Consumer implements Runnable {
    private ShareResource resource = null;

    public Consumer(ShareResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(10);
                resource.popup();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
