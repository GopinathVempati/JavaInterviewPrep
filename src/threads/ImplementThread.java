package threads;

public class ImplementThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running through Runnable interface");
    }

    public static void main(String[] args){
        ImplementThread it = new ImplementThread();
        Thread thread = new Thread(it);
        thread.start();
    }
}
