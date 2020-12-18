package nsu.fit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SpinLockMutex mutex = new SpinLockMutex();
        WorkerThread thread1 = new WorkerThread(mutex);
        WorkerThread thread2 = new WorkerThread(mutex);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
