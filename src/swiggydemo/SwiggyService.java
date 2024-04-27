package swiggydemo;

import java.util.ArrayList;
import java.util.List;

public class SwiggyService {

    public RestaurantList getRestaurantdetails() {

        Restaurant paradise = new Restaurant();
        paradise.restaurentName= "Paradise";
        paradise.mobileNo = "346789";
        paradise.rating = "3.5";
        paradise.address = getAddress("P");
      //  paradise.dishesList = paradise.dishesList;


        Restaurant lucky = new Restaurant();
        lucky.restaurentName= "LuckyRestaurant";
        lucky.mobileNo = "789999";
        lucky.rating = "3.0";
        lucky.address = getAddress("L");
      //  lucky.dishesList = lucky.dishesList;


        Restaurant ishta = new Restaurant();
        ishta.restaurentName = "IshtaRestaurant";
        ishta.mobileNo = "456778";
        ishta.rating = "4.5";
        ishta.address = getAddress("I");
       // ishta.dishesList = ishta.dishesList;


        Dishes biryanis = new Dishes();
        biryanis.dishName = "chickenBiryani";
        biryanis.price = 500;

        Dishes vegStarters = new Dishes();
        vegStarters.dishName = "cornManchuria";
        vegStarters.price = 200;

        Dishes soops = new Dishes();
        soops.dishName = "chillicornSoop";
        soops.price = 180;


        List<Dishes> dishesList = new ArrayList<>();
        dishesList.add(biryanis);
        dishesList.add(vegStarters);
        dishesList.add(soops);
        paradise.dishesList = dishesList;
        lucky.dishesList = dishesList;
        ishta.dishesList = dishesList;


        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(paradise);
        restaurantList.add(lucky);
        restaurantList.add(ishta);
        RestaurantList restaurantList1 = new RestaurantList();
        restaurantList1.restaurantList = restaurantList;


        return restaurantList1;

    }

    private static Address getAddress(String type) {
        Address address = new Address();
        if (type.equalsIgnoreCase("P")) {
            address.area = "Uppal";
            address.flatNo = "7/G";
            address.pincode = "500086";
        } else if (type.equalsIgnoreCase("L")) {

            address.area = "Uppal";
            address.flatNo = "7/G";
            address.pincode = "500086";

        } else if (type.equalsIgnoreCase("I")) {
            {
                address.area = "Uppal";
                address.flatNo = "7/G";
                address.pincode = "500086";
            }

        }
        return address;
    }
}
