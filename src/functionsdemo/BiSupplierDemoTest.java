package functionsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiSupplierDemoTest {
    Supplier<List<Restaurant>> resturantList=()->{
        List<Restaurant> list=new ArrayList<>();
        Restaurant resturant=new Restaurant();
        resturant.name=" Mandi ";
        list.add(resturant);

        Restaurant resturant1=new Restaurant();
        resturant1.name=" KFC ";
        list.add(resturant1);
        return list;

    };
    Consumer<List<Restaurant>> resturantCosumer =(abc)->{
        abc.stream().forEach(test -> {
            System.out.println("Cosumer" + test.name);
        });

    };
    public static void main(String[]args) {
        BiSupplierDemoTest test = new BiSupplierDemoTest();
        List<Restaurant> functionList = test.resturantList.get();
        List<Restaurant> methodList = test.resturantList.get();

        System.out.println(" functionlist " + functionList);
        System.out.println(" Method " + methodList);
    }                                                        //predicte-test();
                                                               // consumer-accept();
}                                                              //supplier-get();
                                                               // function-apply();
