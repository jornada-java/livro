public class Threads_03 {

    public static void main(String[] args) {
        Runnable tarefa1 = new MinhaTarefa();
        new Thread(tarefa1).start();

        Runnable tarefa2 = new MinhaTarefa();
        new Thread(tarefa2).start();

        Runnable tarefa3 = new MinhaTarefa();
        new Thread(tarefa3).start();

        String nomeDaThread = Thread.currentThread().getName();
        System.out.println("Thread principal: " + nomeDaThread);
    }

    static class MinhaTarefa implements Runnable {
        @Override
        public void run() {
            String nomeDaThread = Thread.currentThread().getName();
            System.out.println("Thread da tarefa: " + nomeDaThread);
        }
    }

}
