package ma.ac.emi.info.JobRecommandationsApp.Entities;

public enum Interet {

        SPORT("Pratiquer une activité sportive"),
        LECTURE("Lire des livres"),
        MUSIQUE("Écouter de la musique"),
        VOYAGE("Voyager et découvrir de nouveaux endroits"),
        CUISINE("Cuisiner et essayer de nouvelles recettes"),
        CINÉMA("Regarder des films"),
        ART("Apprécier l'art sous toutes ses formes"),
        TECHNOLOGIE("Suivre les dernières tendances technologiques");

        private String description;

        private Interet(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

}
