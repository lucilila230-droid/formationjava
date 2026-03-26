

public class Programme {
    public static void main(String[] args) {
        Imprimante imprimante = new Imprimante();
        imprimante.imprimer();
        imprimante.imprimer("document1");
        imprimante.imprimer("doc1","doc2");
        imprimante.imprimer("document1", 3);
        imprimante.imprimer("doc5", "doc6", "doc7");
    }
    
}
