package swiggydemo;

public class RestaurantService {
    public Restaurant getRestaurant(RestaurantList restaurantList,String restaurantName){

       for (int i=0; i<=restaurantList.restaurantList.size(); i++){
           if (restaurantList.restaurantList.get(i).equals(restaurantName)){

               System.out.println("Reastaurent Name :"+restaurantList.restaurantList.get(i).restaurentName);
               return restaurantList.restaurantList.get(i);

           }

       }


        return null;
    }
}
