package swiggydemo;

public class Address {
    public String area;
    public String flatNo;
    public String pincode;


    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
