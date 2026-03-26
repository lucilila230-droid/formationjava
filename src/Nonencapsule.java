

public class Client {

    public void crediterCompte(double credit) {
        CompteBancaire cb = new CompteBancaire();
        cb.crediter(100.12);
        //cb.valeur =200; //accessible directement
    }
    
}

class CompteBancaire {
    private double valeur; //protégé -> encapsulation car variable déclarée en private

    public double crediter(double credit) {
        this.valeur+=credit;
        return this.valeur;
    }

    public double getValeur(){ // accesseur pour accéder à la valeur -> encapsulation en utilisant getter 
        return this.valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur; // mutateur pour modifier la valeur -> encapsulation en utilisant setter
    }
}
