

public class Aire {
//la variable devient une constante unique quand final est associé avec static
    public static final double pi = 3.141592653; //final est un mot clé modificateur 
    public final double e = 2.718281828;

    public void modification() {
        System.out.println("Valeur de pi :" + pi);
        System.out.println("Valeur de e : " + e);
        Aire.pi = 3.145;
        this.e= 2.718281828;
    }
}

// final peut être utilisé sur une méthode pour interdire sa redifinition dans les classes dérivées
// final peut être utilisé sur une classe pour interdire l'héritage