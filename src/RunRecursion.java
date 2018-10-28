public class RunRecursion implements Runnable {

    public void start(){
        System.out.println("Start thread");
        new Thread(this,"noNameMain").start();
    }

    @Override
    public void run() {
        System.out.println("Running method");
        new Thread(this,"noName").start();
        new Thread(this,"noName").start();
    }
}
