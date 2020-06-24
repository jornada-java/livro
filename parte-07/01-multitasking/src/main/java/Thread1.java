public class Thread1 {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                //código que vai executar em paralelo
                System.out.println("ID: " + Thread.currentThread().getId());
                System.out.println("Nome: " + Thread.currentThread().getName());
                System.out.println("Prioridade: " + Thread.currentThread().getPriority());
                System.out.println("Estado: " + Thread.currentThread().getState());
            }
        }).start();
    }

}
