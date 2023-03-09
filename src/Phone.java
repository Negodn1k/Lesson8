public class Phone implements Lockable {
    @Override
    public void lock() {
        System.out.println("Phone is locked!");
    }

    Lockable generalUnlock = () -> System.out.println("Phone is unlocked!");

    void unlock() {
        generalUnlock.lock();
    }

    public void go() {
        lock();
        unlock();
        System.out.println();
    }
}
