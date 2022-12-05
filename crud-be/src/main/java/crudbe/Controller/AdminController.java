package crudbe.Controller;

import crudbe.Model.Admin;
import crudbe.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000/")
public class AdminController {

    @Autowired
    AdminRepo adminRepo;

    @PostMapping("/addAdmin")
    Admin addAdmin(@RequestBody Admin addAdmin){
        return adminRepo.save(addAdmin);
    }

    @GetMapping("/getAdmins")
    List<Admin>getAdmins(){
        return adminRepo.findAll();
    }
}
