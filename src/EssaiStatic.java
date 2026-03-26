

public class EssaiStatic {

    private String nom;

    public static void main(String[] args) {
        EssaiStatic.afficheStatic("test d'affichage");
        EssaiStatic objet = new EssaiStatic();
        objet.nom = "essai";
        objet.affiche();
    }

    private static void afficheStatic(String valeur) {
        System.out.println(valeur);
    }

    private void affiche() {
        System.out.println(this.nom);
    }
}
