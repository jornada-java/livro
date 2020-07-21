package threads;

public class Thread_sleep {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread rodando" +i);
            try {
                Thread.sleep((long) (Math.random() *1000));
            } catch (InterruptedException e ) {
                System.err.println("Essa thread foi interrompida");
            }
        }
    }
}
