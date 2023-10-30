package tp04_2;

// Définition de la classe CompteInexistantException qui étend Exception
public class CompteInexistantException extends Exception {
    // Constructeur de la classe
    public CompteInexistantException() {
        // Appelle le constructeur de la classe mère (Exception) avec un message d'erreur
        super("Compte inexistant !");
    }
}