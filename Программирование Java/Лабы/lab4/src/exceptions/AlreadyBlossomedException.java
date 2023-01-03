package exceptions;

public class AlreadyBlossomedException extends Exception{
    private String objectName;
    private static String message = "Уже расцвел";
    public AlreadyBlossomedException(String objectName){
        super(objectName + " " + message);
        this.objectName = objectName;
    }
    @Override
    public String getMessage(){
        return "Объект " + objectName + " " + message;
    }
}
