public class House implements Lockable{
    @Override
    public void lock() {
        System.out.println("House is locked!");
    }

    Lockable generalLock = new Lockable() {
        @Override
        public void lock() {
            System.out.println("House is unlocked!");
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
