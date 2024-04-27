package swiggydemo;

public class MainTest {
    public static void main(String[] args){

        Address address1=new  Address();
        address1.area="Kukatpally";
        address1.flatNo="7/G";
        address1.pincode="50079";



        Address add=address1;
        System.out.println(address1.equals(add));   //reflexive


        Address address2=new  Address();
        address2.area="Kukatpally";
        address2.flatNo="8/G";
        address2.pincode="50079";

        System.out.println(" symmetric Test starts here "+ address1.equals(address2));
        System.out.println(address2.equals(address1));   //symmetric


        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());



    }
}
