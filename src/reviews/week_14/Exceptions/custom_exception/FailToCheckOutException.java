package reviews.week_14.Exceptions.custom_exception;

public class FailToCheckOutException extends Exception{


    public FailToCheckOutException(String message) {
        super(message);
    }
}
