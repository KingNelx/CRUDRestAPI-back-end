package crudbe.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import java.util.Map;
import java.util.HashMap;

@ControllerAdvice
public class UserNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map <String, String> exceptionHandler(UserNotFoundException exception){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("User data is not found ", exception.getMessage());
        return  errorMap;
    }
}
