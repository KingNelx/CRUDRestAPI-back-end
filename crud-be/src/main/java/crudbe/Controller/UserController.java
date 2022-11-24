package crudbe.Controller;

import crudbe.Model.UserModel;
import crudbe.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping  ;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@RestController
@RequestMapping("/user")
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
}
