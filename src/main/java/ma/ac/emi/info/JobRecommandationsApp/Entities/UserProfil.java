package ma.ac.emi.info.JobRecommandationsApp.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Node
public class UserProfil {

    @Id
    @GeneratedValue
    private Long id;

    private String nom;
    private int age;
    private String sexe;
    private List<ExperienceProfessionnelle>   experienceProfs;
    private List<Competence> competences;
    private List<Interet> interets;
    private List<Formation> formations;

}
