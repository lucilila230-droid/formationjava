public class Maison {
//constructeur Java est une méthode spéciale utilisée pour initialiser les objets d'une classe au moment de leur création
    private String materiau;
    private Integer surface;
    private BlocPorte blocPorte; //attribut de type BlocPorte

//pas de type de retour
    public Maison(String materiau, Integer surface) {
        this.materiau = materiau;
        this.surface = surface;

    }

    public Maison( String materiau, Integer surface , Integer hauteur, Integer largeur){
        this("brique", surface);
        this.blocPorte = new BlocPorte(hauteur, largeur); //pour appel du constructeur de BlocPorte
    }
//utilisation de "this" pour appeler un autre constructeur
    public Maison(String materiau) {
        this(materiau, 100);
    }

    public Maison() {
        this("brique", 100);
    }
}

class BlocPorte {
    private Integer hauteur;
    private Integer largeur;

    public BlocPorte(Integer hauteur, Integer largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }
}

/*Gestion mémoire : dans l'objet de type Maison créé,
c'est une référence vers l'objet de type BlockPorte qui sera stocké
et non l'objet en lui-même */

/* un constructeur est une méthode particulière permettant de créer un objet
 autre mot clé pour les constructeurs : super
 pour déclencher l'execution du constructeur de la classe héritée pour la signature demandée
 super() déclenche l'execution du constructeur sans paramètre
 de la classe héritée*/