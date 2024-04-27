package swiggydemo;

import java.util.List;

public class Dishes {
    public String dishName;
    public double price;


    @Override
    public String toString() {
        return " \n Dishes{" +
                "dishName='" + dishName + '\'' +
                ", price=" + price +
                '}';
    }
}
