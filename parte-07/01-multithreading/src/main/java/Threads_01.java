public class Threads_01 {

    public static void main(String[] args) {
        Runnable tarefa = new MinhaTarefa();
        new Thread(tarefa).start();

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
