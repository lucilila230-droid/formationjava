public class Transformation {
    public static void main(String[] args) {


Double monDouble = 3.14159;
String pi = Double.toString(monDouble);
System.out.println("La valeur de pi =" + pi);

String valeurNumerique = "100";
Integer valeur = Integer.parseInt(valeurNumerique);
System.out.println("La valeur numérique est : " + valeur);

//Integer valeur = 100;
System.out.println(valeur);

int valeurPrimitive = 2;
Integer valeurObjetBoxee = valeurPrimitive;
System.out.println("La valeur boxée en Integer est : " + valeurObjetBoxee);


int ValeurPrimitiveUnboxing = valeur;
System.out.println("La valeur primitive après unboxing est : " + ValeurPrimitiveUnboxing);
    }
}


