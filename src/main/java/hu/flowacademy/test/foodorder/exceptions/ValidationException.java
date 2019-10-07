package hu.flowacademy.test.foodorder.exceptions;

public class ValidationException extends RuntimeException {

    private String message;

    ValidationException(String e){
        message=e;
    }
}
