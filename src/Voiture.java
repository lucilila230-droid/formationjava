

public class Voiture{
//création d'une classe voiture avec un attribut marque de type string de visibilité private
    private String marque;
// accesseur getMarque() getter
    public String getMarque() {
        return this.marque;
    }
// mutateur setMarque() setter
    public void setMarque(String marque) {
        if (marque !=null){
            this.marque = marque;
        }
        
    }
// méthode rouler() qui affiche un message indiquant que la voiture roule
    public void rouler(){
        System.out.println("La voiture de marque " + this.marque + " roule");
    }

    private String type;
    private static Integer nombreDeVoitures;

    public void creerVoiture(String type) {
        this.type = type;
        Voiture.nombreDeVoitures++;
    }

    public static Integer getNombreDeVoitures(){
        return Voiture.nombreDeVoitures;
    }
}
