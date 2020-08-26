import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CollectionsSynchronized_01 {

    private static List<String> listaSincronizada = Collections.synchronizedList(new ArrayList<>());

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
            listaSincronizada.add("A");
            System.out.println("Valor adicionado na lista pela thread " + nomeDaThread);
        }
    }

}
