public class main {
    public static void main(String[] args) {
        // Gestion des employés avec SocieteArrayList
        SocieteArrayList societe = new SocieteArrayList();
        Employe emp1 = new Employe(1, "chouikh", "assia", "Informatique", 2);
        Employe emp2 = new Employe(2, "chouikh", "montassar", "Ressources Humaines", 3);
        Employe emp3 = new Employe(3, "chouikh", "tayssir", "Informatique", 1);

        // Ajouter des employés
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);

        System.out.println("=== Gestion des Employés ===");
        // Rechercher un employé par nom
        String nomRecherche = "chouikh";
        System.out.println("\nRecherche de l'employé avec le nom '" + nomRecherche + "': " +
                societe.rechercherEmploye(nomRecherche));

        // Trier et afficher les employés par identifiant
        System.out.println("\nListe des employés triés par identifiant :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // Trier et afficher les employés par nom de département et grade
        System.out.println("\nListe des employés triés par département et grade :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Supprimer un employé et afficher la liste mise à jour
        societe.supprimerEmploye(emp2);
        System.out.println("\nListe des employés après suppression :");
        societe.displayEmploye();

        // Gestion des départements avec DepartementHashSet
        DepartementHashSet departementManager = new DepartementHashSet();
        Departement dep1 = new Departement(1, "Informatique", 10);
        Departement dep2 = new Departement(2, "Ressources Humaines", 5);
        Departement dep3 = new Departement(3, "Marketing", 8);

        // Ajouter des départements
        departementManager.ajouterDepartement(dep1);
        departementManager.ajouterDepartement(dep2);
        departementManager.ajouterDepartement(dep3);

        System.out.println("\n=== Gestion des Départements ===");
        // Afficher les départements
        System.out.println("\nListe des départements :");
        departementManager.displayDepartement();

        // Rechercher un département par nom
        String nomDepartementRecherche = "Informatique";
        System.out.println("\nRecherche du département '" + nomDepartementRecherche + "': " +
                departementManager.rechercherDepartement(nomDepartementRecherche));

        // Trier et afficher les départements par ID
        System.out.println("\nDépartements triés par ID :");
        for (Departement dep : departementManager.trierDepartementById()) {
            System.out.println(dep);
        }

        // Supprimer un département et afficher la liste mise à jour
        departementManager.supprimerDepartement(dep2);
        System.out.println("\nListe des départements après suppression :");
        departementManager.displayDepartement();
    }
}
