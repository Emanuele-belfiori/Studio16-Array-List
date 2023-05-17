import java.util.*;
import java.util.stream.Collectors;


public class Main
{

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
         * - Ordinare elementi .sort()
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

        /* Per far ciclare un Array il comando solito da inserire per richiamare tutto l'array è .length
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

        /*ORDINA L'ELENCO IN ORDINE CRSCENTE IN JAVA*/

        //Questo post discuterà diversi modi per ordinare l'elenco in ordine crescente in Java.
        // Si supponga che l'elenco specificato sia modificabile ma non necessariamente ridimensionabile.

        /*1. Utilizzo Collections.sort() metodo
         * Collections classe di utilità fornisce una statica sort() metodo per ordinare l'elenco specificato
         * in ordine crescente, secondo l'cernita naturale dei suoi elementi.
         */

        // Ordina l'elenco in ordine crescente in Java
        List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
        Collections.sort(list);

        System.out.println(list);

        /*Questo metodo produrrà un ordinamento stabile. Questo funzionerà solo se tutti gli elementi
        dell'elenco implementano il Comparable interfaccia e sono reciprocamente comparabili, cioè per
        qualsiasi coppia di elementi (a, b) nella lista, a.compareTo(b) non lancia un ClassCastException.*/

        /*------------------------------------------------------------------------------------------------------*/
        //2. Utilizzo List.sort() metodo
        /*Ogni List l'implementazione fornisce uno statico sort() metodo che ordina l'elenco in base all'ordine
        indotto dall'oggetto specificato Comparator. Affinché questo metodo funzioni, tutti gli elementi
        dell'elenco devono essere reciprocamente confrontabili utilizzando il comparatore specificato.
         */

        List<Integer> list1 = Arrays.asList(10, 4, 2, 6, 5, 8);
        list1.sort(Comparator.naturalOrder());

        System.out.println(list1);

        /*Se il comparatore specificato è null, tutti gli elementi in questo elenco devono implementare il
        Comparable interfaccia e verrà utilizzato l'ordinamento naturale dell'elemento.
         */

        List<Integer> list2 = Arrays.asList(10, 4, 2, 6, 5, 8);
        list2.sort(null);
        System.out.println(list2);    // [2, 4, 5, 6, 8, 10]

        /*-------------------------------------------------------------------------------------------------------*/

        /*3. Utilizzo di Java 8
        Cernita a List è diventato ancora più semplice con l'introduzione di Stream in Java 8 e versioni
        successive. L'idea è di ottenere un flusso composto dagli elementi dell'elenco, ordinarlo in ordine
        naturale usando il file Stream.sorted() metodo e infine raccogliere tutti gli elementi ordinati in un
        elenco utilizzando Stream.collect() insieme a Collectors.toList(). Affinché l'cernita funzioni, tutti
        gli elementi dell'elenco dovrebbero essere comparabili tra loro.
         */

        List<Integer> list3 = Arrays.asList(10, 4, 2, 6, 5, 8);
        list3 = list3.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list3);   //[2, 4, 5, 6, 8, 10]

        /*--------------------------------------------------------------------------------------------------------*/

        /*4. Ordina l'elenco di oggetti
        Collections.sort(list) e list.sort(null) il metodo funzionerà solo se tutti gli elementi dell'elenco
        implementano il Comparable interfaccia.
         */

        //Ad esempio, il codice seguente crea un elenco di User e da allora User la classe non viene
        // implementata Comparable, il programma genererà un errore di compilazione durante la chiamata
        // Collections.sort() e un ClassCastException Su List.sort(null).

        /*
        import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class User
{
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() { return name; }
}

class Main
{
    public static void main(String[] args)
    {
        List<User> users = Arrays.asList(new User("John"),
                                        new User("Smith"),
                                        new User("Andrew"));

        Collections.sort(users);    // Errore di compilazione

        System.out.println(users);
         */

        /*--------------------------------------------------------------------------------------------------------*/

        /*
        Esistono diversi modi per ordinare un elenco di oggetti:

1. Fai in modo che l'oggetto implementi il Comparable interfaccia ed eseguire l'override di compareTo() metodo.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Company implements Comparable<Company>
{
    private String company;
    private int rank;

    public Company(String company, int rank) {
        this.company = company;
        this.rank = rank;
    }

    @Override
    public int compareTo(Company o) {
        return company.compareTo(o.company);
    }

    @Override
    public String toString() {
        return "{" + company + ", " + rank + "}";
    }
}

// Ordina l'elenco in ordine crescente in Java
class Main
{
    public static void main(String[] args)
    {
        List<Company> list = Arrays.asList(new Company("Google", 1),
                                            new Company("Apple", 3),
                                            new Company("Microsoft", 2));

        // ordina l'elenco in base all'ordine naturale degli oggetti
        Collections.sort(list);
        System.out.println(list);
    }
}

        /*Risultato:

[{Apple, 3}, {Google, 1}, {Microsoft, 2}]
         */

        /*----------------------------------------------------------------------------------------------------*/

        //2. Passa a Comparator al Collections.sort() metodo, che definisce come avverrà l'cernita degli oggetti nell'elenco.
        /*
        class Company
        {
            private String company;
            private int rank;

            public Company(String company, int rank) {
                this.company = company;
                this.rank = rank;
            }

            @Override
            public String toString() { return "{" + company + ", " + rank + "}"; }
            public int getPrice() { return rank; }
        }

// Ordina l'elenco in ordine crescente in Java
        class Main
        {
            public static void main(String[] args)
            {
                List<Company> list = Arrays.asList(new Company("Google", 1),
                        new Company("Apple", 3),
                        new Company("Microsoft", 2));

                // ordina l'elenco in base all'ordine personalizzato definito da Comparator
                Collections.sort(list, new Comparator<Company>() {
                    @Override
                    public int compare(Company o1, Company o2) {
                        return o1.getPrice() - o2.getPrice();
                    }
                });
                System.out.println(list);
            }
        }


        Risultato:

[{Google, 1}, {Microsoft, 2}, {Apple, 3}]*/

        /*------------------------------------------------------------------------------------------------------*/

        /*3. Passa l'espressione lambda a Collections.sort() metodo che definisce l'cernita degli elenchi.
        Funzionerà solo su Java 8 e versioni successive.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

        class Company
        {
            private String company;
            private int rank;

            public Company(String company, int rank) {
                this.company = company;
                this.rank = rank;
            }

            @Override
            public String toString() { return "{" + company + ", " + rank + "}"; }
            public int getPrice() { return rank; }
        }

// Ordina l'elenco in ordine crescente in Java 8 e versioni successive
        class Main
        {
            public static void main(String[] args)
            {
                List<Company> list = Arrays.asList(new Company("Google", 1),
                        new Company("Apple", 3),
                        new Company("Microsoft", 2)
                );

                // definisce l'ordine personalizzato per ordinare un elenco utilizzando l'espressione lambda
                Collections.sort(list, (o1, o2) -> o1.getPrice() - o2.getPrice());

                System.out.println(list);
            }
        }


        Risultato:

[{Google, 1}, {Microsoft, 2}, {Apple, 3}] */

    }
}

