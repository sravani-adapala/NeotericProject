package equalshashcode;

public class EqualsHashCodeDemoTest {
    public static void main(String[] args) {

        Address address1=new Address();

        address1.area="Miyapur";
        address1.street="5th phase";
        address1.state="AP";
        address1.flatNo="1-15";
        address1.pincode="50079";

        Address address2=new Address();

        address2.area="Miyapur";
        address2.street="5th phase";
        address2.state="AP";
        address2.flatNo="1-15";
        address2.pincode="50079";

        System.out.println(address1.equals(address2));

        System.out.println(address2.equals(address1));


    }
}
