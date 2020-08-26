public class Threads_02 {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Thread da tarefa: " + Thread.currentThread().getName())).start();

        String nomeDaThread = Thread.currentThread().getName();
        System.out.println("Thread principal: " + nomeDaThread);
    }

}
