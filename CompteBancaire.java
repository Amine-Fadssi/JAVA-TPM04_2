package tp04_2;

// Définition de la classe CompteBancaire
public class CompteBancaire {
    // Déclaration des attributs de la classe
    private int numero_compte;     // Numéro de compte
    private double solde;          // Solde du compte
    private String nom_titulaire;  // Nom du titulaire du compte

    // Constructeur de la classe
    public CompteBancaire(int numero_compte, double solde, String nom_titulaire) {
        this.numero_compte = numero_compte;
        this.solde = solde;
        this.nom_titulaire = nom_titulaire;
    }

    // Méthode pour déposer de l'argent sur le compte
    public void depot_argent(double solde) {
        this.solde += solde;
    }

    // Méthode pour retirer de l'argent du compte (lancer une exception si les fonds sont insuffisants)
    public void retrait_argent(double solde) throws FondsInsuffisantsException {
        if (this.solde < solde)
            throw new FondsInsuffisantsException();
        this.solde -= solde;
    }

    // Méthode pour afficher le solde du compte
    public double affichage_solde() {
        return this.solde;
    }

    // Méthode pour transférer de l'argent vers un autre compte (lancer des exceptions en cas de problème)
    public void transfer_argent(CompteBancaire cb, double solde) throws CompteInexistantException, FondsInsuffisantsException {
        if (cb == null)
            throw new CompteInexistantException();
        this.retrait_argent(solde);
        cb.depot_argent(solde);
    }


    // Méthode pour obtenir le nom du titulaire du compte
    public String getNom_titulaire() {
        return nom_titulaire;
    }
}
