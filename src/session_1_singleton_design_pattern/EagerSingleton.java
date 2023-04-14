package session_1_singleton_design_pattern;

public final class EagerSingleton {
    private static  final EagerSingleton INTANCE = new EagerSingleton();

    public EagerSingleton() {
        try{
            System.out.println("Initializing by thread: " + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("Initialized: " + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static  EagerSingleton getInstance(){
        return INTANCE;
    }

    public static void main(String[] args) {
        final Thread[] threads = new Thread[5];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(EagerSingleton::getInstance);
        }
        for(Thread thread : threads){
            thread.start();
        }
    }
}
