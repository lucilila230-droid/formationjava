public class Boucles {  
    public static void main(String[] args) {
        // Boucle for
        for (int compteurBoucle = 0; compteurBoucle < 5; compteurBoucle++) {
            System.out.println("Valeur courante de compteur = " + compteurBoucle);
        }

        String[] tableau = {"ain", "aisne", "allier"};
        System.out.println("Taille du tableau : " + tableau.length);
        for (int indice = 0; indice < tableau.length; indice++) {
            System.out.println(tableau[indice]);
        }
        
    
        // Boucle do-while
        String[] villes = {"Paris", "Lyon", "Marseille"};
        Integer indice = 0;
        do {
            System.out.println(villes[indice]);
            indice++;
        } while (indice < villes.length);

        // Boucle while
        System.out.println("test while:");
        Integer increment = 0;
        while (increment < villes.length) {
            System.out.println(villes[increment]);
            increment++;
        }

        //instructions break et continue
        Integer index = 0;
        String[] fruits = {"Pomme", "Banane", "Orange", "Kiwi"};
        while (index < fruits.length) {
            if (fruits[index].equals("Orange")) {
                index++;
                continue; // Ignorer le reste du code dans cette itération et passer à la suivante
            }
            if (fruits[index].equals("Kiwi")) {
                break; // Sortir de la boucle lorsque le fruit est "Kiwi"
            }
            System.out.println(fruits[index]);
            index++;
        }

        // Boucle for intelligente
        String[] legumes = {"Carotte", "Tomate", "Concombre", "Poireaux"};
        for (String legume : legumes) {
            if (legume.equals("Tomate")) {
                continue; // Ignorer la tomate
            }
            if (legume.equals("Concombre")) {
                break; // Sortir de la boucle lorsque le légume est "Concombre"
            }
            System.out.println(legume);
        }
    
    }   
}


