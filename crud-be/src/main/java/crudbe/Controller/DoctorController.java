package crudbe.Controller;

import crudbe.Entity.Doctors;
import crudbe.Repository.DoctorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorsRepo doctorsRepo;

    @PostMapping("/addDoctor")
    Doctors addDoctors(@RequestBody Doctors addDoctors){
        return doctorsRepo.save(addDoctors);
    }

    @GetMapping("/getDoctors")
    List<Doctors> getDoctors(){
        return doctorsRepo.findAll();
    }

    @GetMapping("/age45")
    List<String>getFirstNames(){
        return doctorsRepo.getFirstNames();
    }
}
