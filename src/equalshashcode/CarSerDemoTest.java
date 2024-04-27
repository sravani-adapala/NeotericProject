package equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class CarSerDemoTest {
    public static void main(String[] args) {
        Set<Car> carSet=new HashSet<>();

        Car car1=new Car();
        car1.name="Punch";

        Car car2=new Car();
        car2.name="Punch";
        carSet.add(car1);
        carSet.add(car2);


        System.out.println(carSet);



    }
}
