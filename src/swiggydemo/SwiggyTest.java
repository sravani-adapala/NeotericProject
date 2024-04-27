package swiggydemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwiggyTest {
    public static void main(String[] args) {
        SwiggyService service=new SwiggyService();
        RestaurantList restaurantList=service.getRestaurantdetails();
        System.out.println(restaurantList);

        Scanner input=new Scanner(System.in);

        System.out.println(" Enter Your Restaurant: ");


        String name= input.nextLine();

        RestaurantService restaurantService=new RestaurantService();
       Restaurant restaurant= restaurantService.getRestaurant(restaurantList,name);
        System.out.println(" Restaurant Rating " );













    }
}
