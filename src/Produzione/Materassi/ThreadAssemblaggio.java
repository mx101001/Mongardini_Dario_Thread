package src.Produzione.Materassi;

public class ThreadAssemblaggio extends Thread{
    public ThreadAssemblaggio() {
        super("Assemblaggio");
    }
@Override
public void run(){
         try {
            System.out.println("prima fase Assemblaggio");
            Thread.sleep(1000); // Simula il tempo di preparazione
            
            System.out.println("seconda fase Assemblaggio");
            Thread.sleep(1500); // Simula il tempo di assemblaggio molle
            
            System.out.println("terza fase Assemblaggio");
            Thread.sleep(1000); // Simula il tempo di fissaggio
            
            System.out.println("quarta fase Assemblaggio");
            
        } catch (InterruptedException e) {
            System.err.println("Thread Assemblaggio interrotto: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
    

    
   
}
