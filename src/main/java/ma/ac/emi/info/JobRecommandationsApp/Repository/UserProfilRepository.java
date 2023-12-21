package ma.ac.emi.info.JobRecommandationsApp.Repository;

import ma.ac.emi.info.JobRecommandationsApp.Entities.Competence;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Formation;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Interet;
import ma.ac.emi.info.JobRecommandationsApp.Entities.UserProfil;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserProfilRepository extends Neo4jRepository<UserProfil, Long> {

    Optional<UserProfil> findById(Long id);

    List<UserProfil> findByNom(String nom);

    List<UserProfil> findByAgeGreaterThan(int age);

    List<UserProfil> findByCompetencesIn(List<Competence> competences);

    List<UserProfil> findByInteretsIn(List<Interet> interets);

    List<UserProfil> findByFormationsIn(List<Formation> formations);


}