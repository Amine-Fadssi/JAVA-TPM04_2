package tp04_2;

import tp03.MetierProduitImpl;
import tp03.Produit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<CompteBancaire> compteBancaires = new ArrayList<>();

        //Ajouter des comptes
        compteBancaires.add(new CompteBancaire(1,15500,"FADSSI Amine"));
        compteBancaires.add(new CompteBancaire(2,3500,"HAJJI Mohamed"));

        //Transfer argent
        try{
            //compteBancaires.get(1).transfer_argent(null, 1000);
            compteBancaires.get(1).transfer_argent(compteBancaires.get(0), 4000);
        }catch (CompteInexistantException | FondsInsuffisantsException e) {
            System.out.println(e.getMessage());
        }

        //Affichage information
        System.out.println();
        System.out.println(compteBancaires.get(0).getNom_titulaire()+" : "+compteBancaires.get(0).affichage_solde()+"$");
        System.out.println(compteBancaires.get(1).getNom_titulaire()+" : "+compteBancaires.get(1).affichage_solde()+"$");

        System.out.println("\nFin.");

        /*
        while (true){

            System.out.println("Menu :");
            System.out.println("1. Ajouter des comptes");
            System.out.println("2. Supprimer des comptes");
            System.out.println("3. Transfer argent");
            System.out.println("4. Quitter ce programme");
            System.out.print("Choisissez une option : ");

            int choix = input.nextInt();


            switch (choix) {
                case 1:
                    System.out.println("numero_compte : ");
                    numero_compte = input.nextInt();
                    System.out.println("solde : ");
                    solde = input.nextDouble();
                    System.out.println("nom_titulaire : ");
                    nom_titulaire = input.nextLine();
                    input.nextLine();
                    compteBancaires.add(new CompteBancaire(numero_compte, solde, nom_titulaire));
                    break;
                case 2:
                    System.out.println("numero compte : ");
                    numero_compte = input.nextInt();
                    Iterator<CompteBancaire> iterator = compteBancaires.iterator();
                    while (iterator.hasNext()) {
                        CompteBancaire item = iterator.next();
                        if (item.getNumero_compte()==numero_compte) {
                            iterator.remove();
                        }
                    }
                    break;
                case 3:
                    System.out.println("numero compte cible : ");
                    numero_compte = input.nextInt();
                case 4:
                    System.out.println("Programme terminé!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Choix invalide!");
            }
        }

         */
    }
}
