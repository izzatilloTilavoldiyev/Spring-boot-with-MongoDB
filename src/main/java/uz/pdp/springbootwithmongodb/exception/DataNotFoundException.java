package uz.pdp.springbootwithmongodb.exception;

public class DataNotFoundException extends RuntimeException{

    public DataNotFoundException(String message) {
        super(message);
    }
}
