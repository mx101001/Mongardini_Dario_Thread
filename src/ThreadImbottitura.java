package src;

public class ThreadImbottitura extends Thread {
     public ThreadImbottitura() {
        super("Imbottitura");
    }

@Override
public void run(){
    try {
            System.out.println("prima fase");
            Thread.sleep(800); // Simula il tempo di preparazione materiali
            
            System.out.println("seconda fase");
            Thread.sleep(1200); // Simula il tempo di applicazione primo strato
            
            System.out.println("terza fase");
            Thread.sleep(1000); // Simula il tempo di applicazione secondo strato
            
            System.out.println("quarta fase");
            Thread.sleep(1300); // Simula il tempo di rivestimento
            
            System.out.println("quinta fase");
    } catch (InterruptedException e) {
        System.err.println("Thread interrotto: " + e.getMessage());
        Thread.currentThread().interrupt();
    }
}
}
