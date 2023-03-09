public class Safe implements Lockable {
    @Override
    public void lock() {
        System.out.println("Safe is locked!");
    }

    Lockable generalLock = new Lockable() {
        @Override
        public void lock() {
            System.out.println("Safe is unlocked!");
        }
    };

    void unlock() {
        generalLock.lock();
    }

    public void go() {
        lock();
        unlock();
        System.out.println();
    }
}
