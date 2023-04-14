package session_1_singleton_design_pattern;

public class LazyInitSingleton {
    private static LazyInitSingleton instance;

    public LazyInitSingleton() {
        try{
            System.out.println("Initializing by thread: " + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("Initialized: " + Thread.currentThread().getName());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static LazyInitSingleton getInstance(){
        if(instance == null){
            synchronized (LazyInitSingleton.class){
                if(instance == null){
                    instance = new LazyInitSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        final Thread[] threads = new Thread[5];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(LazyInitSingleton::getInstance);
        }
        for(Thread thread : threads){
            thread.start();
        }
    }
}
