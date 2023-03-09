public class Computer implements Lockable {
    @Override
    public void lock() {
        System.out.println("Computer is locked!");;
    }

    Lockable generalLock = new Lockable() {
        @Override
        public void lock() {
            System.out.println("Computer is unlocked!");
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

