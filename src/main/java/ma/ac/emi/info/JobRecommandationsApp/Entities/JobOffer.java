package ma.ac.emi.info.JobRecommandationsApp.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Node
public class JobOffer {

    @Id
    @Generated
    private int id;
    private String titre;
    private String description;
    private List<Competence> competences;
    private List<Responsabilite> responsabilites;

}
