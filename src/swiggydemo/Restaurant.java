package swiggydemo;

import java.util.List;

public class Restaurant {
    public String restaurentName;
    public String mobileNo;
    public String rating;
    public Address address;

    public List<Dishes> dishesList;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
            if (this.getClass()!=obj.getClass()){
                return false;
            }
            Restaurant otherRestaurant=(Restaurant) obj;
            return this.restaurentName.equals(otherRestaurant.restaurentName);
    }

    @Override
    public String toString() {
        return "\n Restaurant{" +
                "restaurentName='" + restaurentName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", rating='" + rating + '\'' +
                ", address=" + address +
                ", dishesList=" + dishesList +
                '}';
    }
}
