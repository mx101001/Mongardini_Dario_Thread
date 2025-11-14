package src.Produzione.Materassi;

public class ThreadImbottitura extends Thread {
     public ThreadImbottitura() {
        super("Imbottitura");
    }

@Override
public void run(){
    try {
            System.out.println("prima fase Imbottitura");
            Thread.sleep(800); // Simula il tempo di preparazione materiali
            
            System.out.println("seconda fase Imbottitura");
            Thread.sleep(1200); // Simula il tempo di applicazione primo strato
            
            System.out.println("terza fase Imbottitura");
            Thread.sleep(1000); // Simula il tempo di applicazione secondo strato
            
            System.out.println("quarta fase Imbottitura");
            Thread.sleep(1300); // Simula il tempo di rivestimento
            
            System.out.println("quinta fase Imbottitura");

    } catch (InterruptedException e) {
        System.err.println("Thread interrotto Imbottitura " + e.getMessage());
        Thread.currentThread().interrupt();
    }
}
}
