package ma.ac.emi.info.JobRecommandationsApp;

import ma.ac.emi.info.JobRecommandationsApp.Controller.UserProfileController;
import ma.ac.emi.info.JobRecommandationsApp.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JobRecommandationsAppApplication implements CommandLineRunner {

	@Autowired
	private UserProfileController userProfileController;

	public static void main(String[] args) {
		SpringApplication.run(JobRecommandationsAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserProfil userProfil1 = new UserProfil();
		userProfil1.setNom("Aziz");
		userProfil1.setAge(21);
		ExperienceProfessionnelle expro = new ExperienceProfessionnelle();
		expro.setPoste(Responsabilite.TECHNICIEN);
		expro.setDuree(4l);
		expro.setSociete("Azura");
		userProfil1.setExperienceProfs(Arrays.asList(expro));
		userProfil1.setCompetences(Arrays.asList(Competence.ANALYSE_DE_DONNEES, Competence.COMMUNICATION));
		userProfil1.setInterets(Arrays.asList(Interet.CINÉMA, Interet.CUISINE));
		userProfil1.setFormations(Arrays.asList(Formation.BTS));

		// save the UserProfil object to the database
		userProfileController.createUserProfil(userProfil1);
	}
}