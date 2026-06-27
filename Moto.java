public class Moto {
    private String immatriculation;
    private String chauffeurAssigne;
    private boolean estDisponible;

    public Moto(String immatriculation) {
        this.immatriculation = immatriculation;
        this.chauffeurAssigne = "Aucun";
        this.estDisponible = true;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getChauffeurAssigne() {
        return chauffeurAssigne;
    }

    public void setChauffeurAssigne(String chauffeurAssigne) {
        this.chauffeurAssigne = chauffeurAssigne;
    }

    public boolean isEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(boolean estDisponible) {
        this.estDisponible = estDisponible;
    }
}
