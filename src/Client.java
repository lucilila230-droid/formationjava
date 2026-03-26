

public class Client {
   public static void main(String[] args){}
    //private String nomClient;
    private Integer statut;
    private Adresse adresse;

    public Boolean creerClient(String nomClient, Integer statut, String adresse){
        //this.nomClient = nomClient;
        this.statut = statut;
        this.adresse = new Adresse();
        this.adresse.setAdresse(adresse);
         return true;
    

    /*Client monClient = new Client();
    monClient.creerClient("Mon Client", 1, "123 Rue de la Paix, 75000 Paris");
    System.out.println(monClient.getAdresse());

    Client deuxiemeClient = new Client();
    deuxiemeClient.creerClient("Deuxième Client", 1, "456 Avenue des Champs, 75008 Paris");
    System.out.println(deuxiemeClient.getAdresse());
*/
    }  
    public String getAdresse(){
        if (this.adresse != null){
            return this.adresse.getAdresse();
        } else {
            return "Aucune adresse définie pour ce client.";
        }
    }

    public Boolean changerStatut(Integer statut){
        if (this.statut == 0){
            return false;
        }
        this.statut = statut;
        return true;
    }

    public void sanRetourSansParametre(){
        // Le mot-clé void indique qu'une méthode ne retourne aucune valeur et sert à distinguer les procédures (qui effectuent une action) des fonctions (qui renvoient un résultat).
        System.out.println("Méthode sans retour et sans paramètre");
    }
}

class Adresse {
    private String adresse;
    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        if (null != adresse && ! "".equals(adresse)) {
            this.adresse = adresse;
        }
    }
}
