public class Garage {
//création d'une classe garage avec un attribut adresse de type string de visibilité public
    public static String adresse = "Rue de la Paix";

    public static void main(String[] args) {
        Voiture voiture1 = new Voiture();
        voiture1.setMarque("Peugeot");
        voiture1.rouler();

        Voiture voiture2 = new Voiture();
        voiture2.setMarque("Renault");
        voiture2.rouler();
        System.out.println(voiture2.getMarque());
    }

    
}
