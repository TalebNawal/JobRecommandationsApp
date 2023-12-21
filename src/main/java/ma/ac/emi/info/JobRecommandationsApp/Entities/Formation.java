package ma.ac.emi.info.JobRecommandationsApp.Entities;


public enum Formation {
        BACCALAURÉAT("Baccalauréat"),
        BTS("Brevet de Technicien Supérieur"),
        LICENCE("Licence"),
        MASTER("Master"),
        DOCTORAT("Doctorat"),
        FORMATION_PROFESSIONNELLE("Formation professionnelle");

        private String niveau;

        private Formation(String niveau) {
            this.niveau = niveau;
        }

        public String getNiveau() {
            return niveau;
        }
}

