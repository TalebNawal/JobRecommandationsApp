package ma.ac.emi.info.JobRecommandationsApp.Entities;

public enum Responsabilite{


    DIRECTEUR("Directeur"),
    MANAGER("Manager"),
    CHEF_ÉQUIPE("Chef d'équipe"),
    RESPONSABLE_DE_PROJET("Responsable de projet"),
    TECHNICIEN("Technicien"),
    AGENT_DE_MAÎTRISE("Agent de maîtrise"),
    ASSISTANT_ADMINISTRATIF("Assistant administratif"),
    STAGIAIRE("Stagiaire");

    private String titre;

    private Responsabilite(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }
}