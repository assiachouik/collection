public class Departement {
    private int id;
    private String nomDep;
    private int nombreEmployes;

    // Constructeur sans paramètre
    public Departement() {}

    // Constructeur avec paramètres
    public Departement(int id, String nomDep, int nombreEmployes) {
        this.id = id;
        this.nomDep = nomDep;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return id == that.id && nomDep.equals(that.nomDep);
    }

    // Redéfinition de la méthode hashCode (nécessaire pour HashSet)
    @Override
    public int hashCode() {
        return id * 31 + nomDep.hashCode();
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nombreEmployes=" + nombreEmployes +
                '}';
    }
}
