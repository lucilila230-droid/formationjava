public class StructuresConditionnelles {
    public static void main(String[] args) {

        int temperature = 110;

        if (temperature < 0) {
            System.out.println("L'eau est gelée");
        } else {
            if (temperature == 0) {
            System.out.println("Point de transformation de l'eau en glace");
        } else {
            if (temperature > 99) {
            System.out.println("L'eau est à l'état de vapeur");
        } else {
            System.out.println("L'eau est à l'état liquide");
            }
            
        }
        }

        char note ='D';
        switch (note){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Très bien");
                break;
            case 'C':
                System.out.println("Bien");
                break;
            case 'D':
                System.out.println("Passable");
                break;
            case 'E':
                System.out.println("Insuffisant");
                break;
            default:
                System.out.println("Note invalide");

        }
        System.out.println("Votre note est " + note);
    }
}

