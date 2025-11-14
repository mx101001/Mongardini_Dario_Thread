package src;

public class ProcessoPadre {
    public static void main(String[] args){

         // Creazione dei thread 
        ThreadImbottitura threadImbottitura = new ThreadImbottitura();
        ThreadAssemblaggio threadAssemblaggio = new ThreadAssemblaggio();

        // Avvio dei thread in parallelo
        threadAssemblaggio.start();
        threadImbottitura.start();

        try {
             // Attesa del completamento dei thread figli (join)
            threadAssemblaggio.join();
            threadImbottitura.join();
        } catch (InterruptedException e) {
            System.err.println("Errore durante l'attesa dei thread: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
