public class RunnableDemo implements Runnable {
    private Thread t;
    private final String nameThread;

    public RunnableDemo(String name) {
        this.nameThread = name;
        System.out.println("Creating : " + nameThread);
    }

    @Override
    public void run() {
        System.out.println("Running " + nameThread);
        try {
            for (int i = 4; i > 0 ; i--) {
                System.out.println("Thread " + nameThread + "," + i );
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " + nameThread + "interrupted") ;
        }
        System.out.println("Thread " + nameThread + "existing");
    }
    public void start() {
        System.out.println("Starting " + nameThread);
        if (t == null) {
            t = new Thread(this,nameThread);
            t.start();
        }
    }
}
