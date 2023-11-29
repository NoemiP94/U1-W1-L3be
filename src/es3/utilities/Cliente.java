package es3.utilities;

public class Cliente {
//    ATTRIBUTI
    private int codiceCliente;
    private String nomeCognomeCliente;
    private String email;
    private String dataIscrizione;

//    GETTER
    public int getCodiceCliente() {
        return this.codiceCliente;
    }

    public String getNomeCognomeCliente() {
        return this.nomeCognomeCliente;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDataIscrizione() {
        return this.dataIscrizione;
    }

    //    COSTRUTTORE
    public Cliente(int codiceCliente, String nomeCognomeCliente, String email, String dataIscrizione){
        this.codiceCliente = codiceCliente;
        this.nomeCognomeCliente = nomeCognomeCliente;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

//    METODI
public static void stampaCliente(Cliente customer){
    System.out.println("Codice cliente: " + customer.codiceCliente + "; nome e cognome del cliente: " + customer.nomeCognomeCliente +
            "; email cliente: " + customer.email + " ; data iscrizione: " + customer.dataIscrizione);
}
}
