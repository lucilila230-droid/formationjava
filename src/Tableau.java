public class Tableau {
//tableau de base : suite ordonnée ou non d'élements de même type
    private String[] tableau = new String[4];
/* particularité  : déclaration + allocation mémoire - ici on peut stocker 
4 objets de type String dans ce tableau */

    public void chargement () {
        System.out.println("chargement... ");
        this.tableau[0] = "chaine1"; //le premier indice commence à 0
        this.tableau[1] = "chaine2 ";
        this.tableau[2] = "chaine 3";
    } // alimentation du tableau

    public void afficheTableau(){
        System.out.println("afficheTableau");
        for (int i=0; i< this.tableau.length ; i++){
            //récupération de la taille du tableau - propriété length
            System.out.println(this.tableau[i]);
            // accès à l'élément pour l'indice "i"
        }
    }
    public void accesTableau() {
        System.out.println("accesTableau...");
        System.out.println(this.tableau[3]); //NULL
        System.out.println(this.tableau[4]); // Exception
    }

}
/* Pour lire un tableau :le nombre d'éléments chargés peut être 
différent de la taille du tableau
l'accès à un indice (dans les bornes du tableau) pour lequel
il n'y a pas d'objet chargé retourne NULL
La tentative d'accès en dehors des bornes du tableau lève
une exception
 */