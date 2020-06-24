public class Thread3 extends Thread {

    public static void main(String[] args) {
        new Thread3().run();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread rodando" + i);
            try {
                this.join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrompida");
            }
        }
    }
}
