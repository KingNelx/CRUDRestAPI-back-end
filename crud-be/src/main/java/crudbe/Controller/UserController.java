package crudbe.Controller;

import crudbe.Exception.UserNotFoundException;
import crudbe.Model.User;
import crudbe.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:3000/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/addUser")
    User addUser(@RequestBody User addUser){
        return userRepository.save(addUser);
    }

    @GetMapping("/getAllUsers")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    User getUserByID(@PathVariable long id){
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/users/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){
        return userRepository.findById(id).map(user -> {
            user.setFirstName(newUser.getFirstName());
            user.setLastName(newUser.getLastName());
            user.setUserName(newUser.getUserName());
            user.setEmail(newUser.getEmail());
            return userRepository.save(user);
        }).orElseThrow(() ->  new UserNotFoundException(id));
    }

    @DeleteMapping("/users/{id}")
    String deleteUserById(@PathVariable Long id){
        if(!userRepository.existsById(id))
        {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id: "+id+" has been deleted successfully";
    }
}
