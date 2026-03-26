

public class Imprimante {
//4 méthodes imprimer()
    public void imprimer(String document1, String document2) {
        // utilisation du mot clé this pour appeler une méthode surchargée dans une autre
        this.imprimer(document1, 10);
        this.imprimer(document2, 10);
        System.out.println("document1");
        System.out.println(document1 +document2);
    }
    
    public void imprimer(String...document1){
        System.out.println("imprimer2");
        for(String doc : document1){
            System.out.println(doc);
        }
    }

    public void imprimer(String document, Integer nombre){
        System.out.println("imprimer3");
        for(int indice =0; indice < nombre; indice++){
            System.out.println(document);
        }
    }

    public void imprimer() {
        System.out.println("Page de teste");
    }
}
