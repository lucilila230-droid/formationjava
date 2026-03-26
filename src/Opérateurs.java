public class Opérateurs {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println("Addition: " + sum);
        Integer compteur = 10;
            compteur++; // Incrémentation de 1
            System.out.println(" Valeur du Compteur après incrémentation: " + compteur);

        // Soustraction
        int difference = a - b;
        System.out.println("Soustraction: " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product);

        // Division
        int quotient = a / b;
        System.out.println("Division: " + quotient);

        // Modulo
        int remainder = a % b;
        System.out.println("Modulo: " + remainder);

        Integer nombreArticles = 5;
        Double prixUnitaire = 12.45;
        Double total = nombreArticles * prixUnitaire;
        Double rabais = total / 10; // 10% de rabais
        Double aPayer = total - rabais;
        System.out.println("Total à payer = " + aPayer);

        /*int entier1 = 10;
        int entier2 = 10;
        System.out.println("Comparaison d'égalité: " + (entier1 == entier2)); // true

        String chaine1 = "Formation Java";
        String chaine2 = new String("Formation Java");
        System.out.println("Comparaison de chaînes: " + (chaine1 == chaine2)); // false
        System.out.println("Comparaison objet = " + chaine1.equals(chaine2)); // true
    */
        int entier1 = 10;
        int entier2 = 20;

        String chaine1 ="Formation Java";
        String chaine2 = "Formation Java";

        System.out.println(entier1==entier2 && chaine1.equals(chaine2));
        System.out.println(entier1==entier2 || chaine1.equals(chaine2)); // false

        int resultat = (entier1==entier2)?10:20;
        System.out.println("Résultat =" + resultat);
    }
    
}
