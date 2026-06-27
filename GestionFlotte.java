import java.util.ArrayList;
import java.util.List;

public class GestionFlotte {
    private List<Moto> listeMotos;

    public GestionFlotte() {
        this.listeMotos = new ArrayList<>();
    }

    public void ajouterMoto(Moto moto) {
        this.listeMotos.add(moto);
    }

    public void assignerChauffeur(Moto moto, Chauffeur chauffeur) {
        if (moto.isEstDisponible()) {
            moto.setChauffeurAssigne(chauffeur.getNom());
            moto.setEstDisponible(false); // La moto n'est plus disponible
            System.out.println("Le chauffeur " + chauffeur.getNom() + " a ete assigne a la moto " + moto.getImmatriculation());
        } else {
            System.out.println("Desole, la moto " + moto.getImmatriculation() + " est deja occupee.");
        }
    }

    public List<Moto> getListeMotos() {
        return listeMotos;
    }
}
