public class RunColors implements Runnable {
    Thread thread;
    String threadName;


    public RunColors(String threadName) {
        this.threadName = threadName;
        System.out.println("RunColors class created with name " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running thread " + threadName);
        for (int i = 0; i <10; i++) {
            System.out.println(" Thread name " +threadName +"iterator "+ i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void start(){
        System.out.println("Start thread " + threadName);
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}