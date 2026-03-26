

import java.io.Serializable;

public class Client implements Serializable {

    private String nom;
    public Client(){
    
    }
    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
}
