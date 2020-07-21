package threads;

public class Thread_wait {
    public static void main(String[] args) {
        Thread_waitB b = new Thread_waitB();
        b.start();

        synchronized(b){
            try{
                System.out.println("Esperando o B estar completo...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("O valor total é: " + b.total);
        }
    }
}

class Thread_waitB extends Thread{
    int total;
    @Override
    public void run(){
        // lógica responsável por fazer um contator e gerar um notify
        // quando outra thread for iniciada
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
        }
    }

}