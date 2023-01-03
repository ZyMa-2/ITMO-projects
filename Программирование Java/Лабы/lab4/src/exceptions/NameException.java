package exceptions;

public class NameException extends RuntimeException{
    public NameException(String objectName){
        super(objectName);
    }
}
