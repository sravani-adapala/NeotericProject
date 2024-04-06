package swiggydemo;

import java.util.ArrayList;
import java.util.List;

public class SwiggyTest {
    public static void main(String[] args) {
        SwiggyService service=new SwiggyService();
        service.getRestaurantdetails();
        RestaurantList list= service.getRestaurantdetails();
        System.out.println(list);






    }
}
