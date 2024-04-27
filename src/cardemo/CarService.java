package cardemo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public class CarService {
    public Car getCar(){


        AC ac=new AC();
        ac.companyName="Haier";

        Break break1=new Break();
        break1.handleBreak="yes";
        break1.legBreak="yes";


        Fuel fuel=new Fuel();
        fuel.fuelType="Petrol";


        Engine engine=new Engine();
        engine.fuel=fuel;


        Seat seat=new Seat();
        seat.type="leather";
        List<Seat> seatList=new ArrayList<>();
        seatList.add(seat);


        Wheel wheel=new Wheel();
        wheel.wheelType="Alloy";
        wheel.wheelBrand="Apollo";
        List<Wheel> wheelList=new ArrayList<>();
        wheelList.add(wheel);

       Car car1=new Car();
       car1.systemNumber=UUID.randomUUID().toString();
       car1.engine=engine;
       car1.ac=ac;
       car1.aBreak=break1;
       car1.wheelList=wheelList;
       car1.seatList=seatList;


        System.out.println(car1);

        return car1;

    }
}
