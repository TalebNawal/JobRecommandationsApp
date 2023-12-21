package ma.ac.emi.info.JobRecommandationsApp.Service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Competence;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Formation;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Interet;
import ma.ac.emi.info.JobRecommandationsApp.Entities.UserProfil;
import ma.ac.emi.info.JobRecommandationsApp.Repository.UserProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@RequiredArgsConstructor
public class UserProfileService {


    @Autowired
    private  UserProfilRepository userProfilRepository ;




    public void createUserProfil(UserProfil userProfil) {
        userProfilRepository.save(userProfil);
    }

    public Optional<UserProfil> getUserProfilById(Long id) {
        return userProfilRepository.findById(id);
    }

    public List<UserProfil> getAllUserProfils() {
        return (List<UserProfil>) userProfilRepository.findAll();
    }

    public List<UserProfil> searchUserProfils(String nom, int age, List<Competence> competences, List<Interet> interets, List<Formation> formations) {
        if (nom == null && age == 0 && competences == null && interets == null && formations == null) {
            return getAllUserProfils();
        } else {
            return userProfilRepository.findByNom(nom)
                    .stream()
                    .filter(userProfil -> age == 0 || userProfil.getAge() == age)
                    .filter(userProfil -> competences == null || userProfil.getCompetences().containsAll(competences))
                    .filter(userProfil -> interets == null || userProfil.getInterets().containsAll(interets))
                    .filter(userProfil -> formations == null || userProfil.getFormations().containsAll(formations))
                    .collect(Collectors.toList());
        }
    }

    public void deleteUserProfil(Long id) {
        userProfilRepository.deleteById(id);
    }
}