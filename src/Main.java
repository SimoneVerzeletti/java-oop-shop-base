public class Main {
    public static void main(String[] args) {
        Prodotto cacciavite/* <-è l'istanza */ = new Prodotto("Cacciavite star", "Serve per cacciare la vite", 2.64, 20);
        
        Prodotto colla = new Prodotto("Colla super star", "Serve per incollare", 3.15, 10);

        Prodotto caricabatterie = new Prodotto("caricabatterie", "Serve per caricare le baterie", 19.99, 22);

        System.out.println("Il prodotto " + cacciavite.getNome() + " ha il codice " + cacciavite.getCodice() +" " + cacciavite.descrizione + " costa " + cacciavite.getPrezzoIva());

        System.out.println("Il prodotto " + colla.getNome() + " ha il codice " + colla.getCodice() +" " + colla.descrizione + " costa " + colla.getPrezzoIva());

        System.out.println("Il prodotto " + caricabatterie.getNome() + " ha il codice " + caricabatterie.getCodice() +" " + caricabatterie.descrizione + " costa " + caricabatterie.getPrezzoIva());

    }
}
