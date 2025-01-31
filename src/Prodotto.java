import java.util.Random;

public class Prodotto {
    
    //caratteristiche/attributi
    public int codice;
    public String nome;
    public String descrizione;
    public Double prezzo;
    public Double iva;  

    //costruttore
    public Prodotto(int codice, String nome, String descrizione, Double prezzo, Double iva){
        Random ran = new Random();
        this.codice = ran.nextInt(99999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
  
    //metodi
     public Double getPrezzoBase() {
        return prezzo;
    }
    public Double getPrezzoIva(){
        return prezzo + (prezzo * iva / 100);
    }
    public String getNomeEsteso(){
        return codice + "-" + nome;
    }
}
