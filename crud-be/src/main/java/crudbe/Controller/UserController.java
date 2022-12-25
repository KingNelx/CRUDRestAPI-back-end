package crudbe.Controller;

import crudbe.Exception.UserNotFoundException;
import crudbe.Model.User;
import crudbe.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    User addUser(@RequestBody User addUser){
        return userRepository.save(addUser);
    }

    @GetMapping("/getUsers")
    List<User> getUsers(){
        return userRepository.findAll();
    }

   @PutMapping("/users/{id}")
    User updateUser (@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map((user) -> {
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setEmail(newUser.getEmail());
                    user.setAge(newUser.getAge());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));
   }

   @DeleteMapping("/users/{id}")
    String deleteUser (@PathVariable Long id) {
        if(!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with ID: " + id + "has been deleted successfully";
   }
}
