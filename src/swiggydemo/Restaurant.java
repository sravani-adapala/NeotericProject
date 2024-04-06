package swiggydemo;

import java.util.List;

public class Restaurant {
    public String name;
    public String mobileNo;
    public String rating;
    public Address address;

    public List<Dishes> dishesList;

    @Override
    public String toString() {
        return "\n Restaurant{" +
                "name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", rating='" + rating + '\'' +
                ", address=" + address +
                ", dishesList=" + dishesList +
                '}';
    }
}
