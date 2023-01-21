import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        System.out.println("Arraylist:");
        System.out.println();

        /*
         *Arraylist:
         *
         * -Le ArrayList sono array ridimensionabili, accettano però solo reference
         *
         * - Creare un arraylist
         *
         * - Aggiungere elementi add()
         *
         * - Mandare a schermo elementi get()
         *
         * - Modificare elementi set()
         *
         * - Rimuovere elementi remove(), clear()
         *
         * -- ArrayList 2D
         */

        /*--------------------------------------------------------------------------------------------*/

        // COSA SONO GLI ARRAY LIST:


        /*
        A Differenza degli array classici a cui vine fissata una dimensione che non è modificabile
        gli ArrayList invece si può modificare la dimensione= aggiungere o modificare o rimuovere
        gli elementi degli stessi.
        Questi ArrayList accetteranno solo però dei dati di tipo reference
        ANCHE LORO CONTANO LE CELLE PARTENDO DA 0
         */

        /*--------------------------------------------------------------------------------------------*/

        /* CREARE ARRAYLIST */
        ArrayList<String> giorni = new ArrayList(); // Richiamo classe e creo ArrayList

        /* AGGIUNGERE ELEMENTI */
        giorni.add("Lunedì"); // Cella 0
        giorni.add("Martedì"); // Cella 1
        giorni.add("Mercoledì"); // Cella 2
        giorni.add("Giovedì"); // Cella 3
        giorni.add("Venerdì"); // Cella 4
        giorni.add("Mercoledì"); // Cella 5
        giorni.add("Domenica"); // Cella 6
        giorni.add("Giorno errato"); // Cella 7


        /* MANDARE A SCHERMO ELEMENTI GET */
        //System.out.println(giorni.get(0)); // Sceglieremo il contenitore da richiamare

        /* MODIFICARE ELEMENTI SET */
        giorni.set(5, "Sabato"); // modificato cella 5 con giorno Sabato

        /* RIMUOVERE ELEMENTI REMOVE() */
        giorni.remove(7);

        /* RIMUOVERE= CAMCELLARE L'INTERO CONTENUTO DELL'ARRAYLIST */
        // giorni.clear();
        // lo lascio commentato se no tutto si cancellerebbe e a stampa non avremmo nulla

        /* Per farlo ciclare il comando solito da inserire per richiamare tutto l'array è .length
        in questo caso la sintassi cambia in .size -->(DA RICORDARE)*/
        for (int i = 0; i < giorni.size(); i++) {
            System.out.println(giorni.get(i));
        }//FINE FOR--> FINE PROGRAMMA
        System.out.println();


        /*----------------------------------------------------------------------------------------------*/

        /* DIMOSTRAZIONE ACCETAZIONE PRIMITIVE IN UN NUOVO PROGRAMMA */

        ArrayList<Integer> numeroGiorni = new ArrayList();

        numeroGiorni.add(1);
        numeroGiorni.add(2);
        numeroGiorni.add(3);
        numeroGiorni.add(4);
        numeroGiorni.add(5);
        numeroGiorni.add(6);
        numeroGiorni.add(7);


        for (int y = 0; y < numeroGiorni.size(); y++) {
            System.out.println(numeroGiorni.get(y));
        }
        System.out.println();

    }
}
