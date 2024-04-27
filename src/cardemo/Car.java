package cardemo;

import java.util.List;

public class Car {

    public  String systemNumber;
    public Engine engine;
    List<Wheel>wheelList;
    List<Seat>seatList;
    public Break aBreak;

    public AC ac;


    @Override
    public String toString() {
        return "Car{" +
                "systemNumber='" + systemNumber + '\'' +
                ", engine=" + engine +
                ", wheelList=" + wheelList +
                ", seatList=" + seatList +
                ", aBreak=" + aBreak +
                ", ac=" + ac +
                '}';
    }
}
