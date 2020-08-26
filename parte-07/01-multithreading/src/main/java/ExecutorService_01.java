import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorService_01 {

    public static void main(String[] args) {
        ExecutorService executor = null;
        try {
            executor = Executors.newFixedThreadPool(2);
            executor.execute(new MinhaTarefa());
            executor.execute(new MinhaTarefa());
            executor.execute(new MinhaTarefa());
        } finally {
            if (executor != null) {
                executor.shutdown();
            }
        }
    }

    static class MinhaTarefa implements Runnable {
        @Override
        public void run() {
            String nomeDaThread = Thread.currentThread().getName();
            System.out.println("Thread da tarefa: " + nomeDaThread);
        }
    }

}
