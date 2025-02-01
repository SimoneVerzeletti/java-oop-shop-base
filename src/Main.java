public class Main {
    public static void main(String[] args) {
        Prodotto cacciavite/* <-è l'istanza */ = new Prodotto();
        cacciavite.codice = 151654;
        cacciavite.nome = "Cacciavite star";
        cacciavite.descrizione = "Serve per cacciare la vite!!";
        cacciavite.prezzo = 1.15;
        cacciavite.iva = 22;

        Prodotto colla = new Prodotto();
        colla.codice = 151654;
        colla.nome = "Colla super star";
        colla.descrizione = "Serve per incollare cose.";
        colla.prezzo = 3.15;
        colla.iva = 10.1;

        Prodotto caricabatterie = new Prodotto();
        caricabatterie.codice = 151654;
        caricabatterie.nome = "Caricabatterie rapido";
        caricabatterie.descrizione = "Serve per caricare le batterie.";
        caricabatterie.prezzo = 19.99;
        caricabatterie.iva = 40;



    }
}
