package nsu.fit;

import java.util.concurrent.atomic.AtomicBoolean;

public class SpinLockMutex {
    private final AtomicBoolean locked = new AtomicBoolean();

    public void get() {
        while (!locked.compareAndSet(false, true)) {
        }
    }

    public void release() {
        locked.set(false);
    }
}
