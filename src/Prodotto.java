import java.util.Random;

public class Prodotto {
    
    //caratteristiche/attributi
    public int codice;

    public String nome;
    
    public String descrizione;
    
    public double prezzo;
    
    public double  iva;  

    //costruttore
    public Prodotto(String nome, String descrizione, double prezzo, double iva){
        Random ran = new Random();
        this.codice = ran.nextInt(1000, 9999);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
  
    //metodi
    public String getNome(){
        return nome;
    }
    public String getDescrizione(){
        return descrizione;
    }    
     public double getPrezzoBase() {
        return prezzo;
    }
    public double getPrezzoIva(){
        return prezzo + (prezzo * iva / 100);
    }
    public int getCodice(){
        return codice;
    }
    public String getNomeEsteso(){
        return codice + "-" + nome;
    }
}
