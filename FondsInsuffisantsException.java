package tp04_2;

// Définition de la classe FondsInsuffisantsException qui étend Exception
public class FondsInsuffisantsException extends Exception {
    // Constructeur de la classe
    public FondsInsuffisantsException() {
        // Appelle le constructeur de la classe mère (Exception) avec un message d'erreur
        super("Fonds Insuffisants!");
    }
}
