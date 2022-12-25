package crudbe.Exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found User with id of: " + id);
    }
}
