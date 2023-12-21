package ma.ac.emi.info.JobRecommandationsApp.Controller;


import lombok.AllArgsConstructor;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Competence;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Formation;
import ma.ac.emi.info.JobRecommandationsApp.Entities.Interet;
import ma.ac.emi.info.JobRecommandationsApp.Entities.UserProfil;
import ma.ac.emi.info.JobRecommandationsApp.Service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/userprofils")
public class UserProfileController {


     UserProfileService userProfileService= new UserProfileService();

    @PostMapping
    public ResponseEntity<UserProfil> createUserProfil(@RequestBody UserProfil userProfil) {
        userProfileService.createUserProfil(userProfil);
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserProfil> getUserProfilById(@PathVariable Long id) {
        Optional<UserProfil> userProfil = userProfileService.getUserProfilById(id);
        if (userProfil.isPresent()) {
            return ResponseEntity.ok(userProfil.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public List<UserProfil> getAllUserProfils() {
        return userProfileService.getAllUserProfils();
    }

    @GetMapping("/search")
    public List<UserProfil> searchUserProfils(@RequestParam(required = false) String nom,
                                              @RequestParam(required = false, defaultValue = "0") int age,
                                              @RequestParam(required = false) List<Competence> competences,
                                              @RequestParam(required = false) List<Interet> interets,
                                              @RequestParam(required = false) List<Formation> formations) {
        return userProfileService.searchUserProfils(nom, age, competences, interets, formations);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserProfil(@PathVariable Long id) {
        userProfileService.deleteUserProfil(id);
        return ResponseEntity.noContent().build();
    }
}