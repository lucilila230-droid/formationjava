public class Maison {
//constructeur Java est une méthode spéciale utilisée pour initialiser les objets d'une classe au moment de leur création
    private String materiau;
    private Integer surface;
//pas de type de retour
    public Maison(String materiau, Integer surface) {
        this.materiau = materiau;
        this.surface = surface;

    }

    public Maison(Integer surface){
        this("brique", surface);
    }
//utilisation de "this" pour appeler un autre constructeur
    public Maison(String materiau) {
        this(materiau, 100);
    }

    public Maison() {
        this("brique", 100);
    }
}
