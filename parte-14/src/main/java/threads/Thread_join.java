package threads;

public class Thread_join extends Thread{

    public static void main(String[] args) {

        new Thread().run();
    }

    @Override
    public void run() {
        for (int i = 0; i <10; i++) {
            System.out.println("Thread esta rodando" +i);
        } try {
            this.join();
        } catch (InterruptedException e) {
            System.err.println("Essa thread foi interrompida");
        }
    }
}