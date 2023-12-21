package ma.ac.emi.info.JobRecommandationsApp.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceProfessionnelle {



    @Id
    @Generated
    private int id;
    private Responsabilite poste;
    private Long duree;
    private String societe;
}
