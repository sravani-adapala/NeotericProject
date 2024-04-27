package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class
CollectionTest {
    public static void main(String[] args) {

        Restaurant restaurant1=new Restaurant();
        restaurant1.restaurantName="Mefphil Restaurant";

        Restaurant restaurant2=new Restaurant();
        restaurant2.restaurantName="Pista House";

        Restaurant restaurant3=new Restaurant();
        restaurant3.restaurantName="Lucky";


        List<Restaurant> restaurantList=new ArrayList<>();

        restaurantList.add(restaurant1);
        restaurantList.add(restaurant2);
        restaurantList.add(restaurant3);

        RestaurantList list=new RestaurantList();
        list.restaurantList=restaurantList;

        for (int i=0; i<list.restaurantList.size();i++){
            Restaurant restaurant=list.restaurantList.get(i);
            System.out.println(" Normal For Loop = " +restaurant.restaurantName);

        }
        Iterator<Restaurant>restaurantIterator=list.restaurantList.iterator();
        for (; restaurantIterator.hasNext();){
            Restaurant restaurant=restaurantIterator.next();
            System.out.println(" Iterator = " +restaurant.restaurantName);

        }

        list.restaurantList.forEach(restaurant -> System.out.println(" For Each = " +restaurant.restaurantName));


    }
}
