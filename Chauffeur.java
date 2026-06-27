public class Chauffeur {
    private String nom;
    private String numeroPermis;

    public Chauffeur(String nom, String numeroPermis) {
        this.nom = nom;
        this.numeroPermis = numeroPermis;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }
}
