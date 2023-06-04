package reviews.week_14.Exceptions.custom_exception;

public class Library {

    public void getLibraryCard(String city){

        if (city.equals("fairfax") || city.equals("mcclean")){
            System.out.println("library card ok");
        }else {
            throw new NonResidentException("You can not get the card");
        }
    }
}
