package crudbe.Controller;

import crudbe.Entity.Patients;
import crudbe.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@RestController
@RequestMapping("/rhu")
public class RHUController {

    @Autowired
    PatientRepo patientRepo;

    @PostMapping("/addPatient")
    Patients addPatient(@RequestBody Patients addPatient){
        return patientRepo.save(addPatient);
    }

    @GetMapping("/getAllPatients")
    List<Patients> getAllPatients(){
        return patientRepo.findAll();
    }
}
