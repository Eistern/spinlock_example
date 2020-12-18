package nsu.fit;

public class WorkerThread extends Thread {
    private final SpinLockMutex mutex;

    public WorkerThread(SpinLockMutex mutex) {
        this.mutex = mutex;
    }

    @Override
    public void run() {
        mutex.get();
        System.out.println("Worker" + this + ": First output");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker" + this + ": Second output");
        mutex.release();
    }
}
