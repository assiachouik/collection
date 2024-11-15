public class Employe {
    // Attributs de la classe Employe
    private int identifiant;
    private String nom;
    private String prenom;
    private String nomDep;
    private int grade;

    // Constructeur sans paramètre
    public Employe() {}

    // Constructeur avec paramètres
    public Employe(int identifiant, String nom, String prenom, String nomDep, int grade) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;
    }

    // Getters et Setters
    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Redéfinition de la méthode equals pour comparer deux employés par identifiant et nom
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return identifiant == employe.identifiant && nom.equals(employe.nom);
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'employé
    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                ", grade=" + grade +
                '}';
    }
}
