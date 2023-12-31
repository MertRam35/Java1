package reviews.week_14.Exceptions.custom_exception;

public class NonResidentException extends RuntimeException{

    public NonResidentException(String message) {
        super(message);
    }
}
/*```

Create a class NonResidentException
    make this a unchecked exception

    create a constructor to accept the String argument and pass it to the super constructor

 Create a class FailToCheckOutException
    make this a checked exception

    create a constructor to accept the String argument and pass it to the super constructor

Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file

Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution*/