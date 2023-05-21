package reviews.week_12;

public class Address {

    private String street, city;
    private int zipcode;
    private String country;

    public Address(String street, String city, int zipcode, String country) {
        setStreet(street);
        this.city = city;
        setZipcode(zipcode);
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street.isEmpty() || street.length()>50){
            if (street.isEmpty()){
                System.out.println("You can not use empty street");
            }else {
                System.out.println("You can not use Street length more tan 50 char");
            }
            System.exit(0);
        }else {
            this.street = street;
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {

        return zipcode;
    }

    public void setZipcode(int zipcode) {
        if ((zipcode+"").length()==5){
            this.zipcode = zipcode;
        }else {
            System.out.println("in valid zipcode");
            System.exit(0);
        }

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                ", country='" + country + '\'' +
                '}';
    }
}
/*Task 1: AdressTask

    Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments*/