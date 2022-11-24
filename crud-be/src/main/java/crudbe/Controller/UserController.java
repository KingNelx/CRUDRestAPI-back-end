package crudbe.Controller;

import crudbe.Model.UserModel;
import crudbe.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping  ;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    UserModel addUser(@RequestBody UserModel addUser){
        return userRepository.save(addUser);
    }

    @GetMapping("/getAllUsers")
    List<UserModel> getAllUser(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    UserModel getUserByID(@PathVariable Long id){
        return userRepository.findById(id).orElseThrow()
    }
}
