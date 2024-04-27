package functionsdemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemoTest {

    Function<String,String> toUpperFunc = (fullName) ->{
        return fullName.toUpperCase();

    };


    BiFunction<String,String,String> concatFunc = (firstName,lastName) ->{
                               String  fullName=firstName+lastName;
                               System.out.println(" Name "+ fullName);
                               return fullName;

    };

    BiFunction<String,String,Integer> countFunc = (firstName,lastName) -> {
        String fullName = firstName + lastName;
        System.out.println(" Name " + fullName);
        return fullName.length();
    };



    public String concatName(String firstName, String lastName){

        String fullName=firstName+lastName;
        System.out.println(" Name "+ fullName);
        return fullName;

    }
    public static void main(String[] args) {

        FunctionDemoTest demoTest=new FunctionDemoTest();

        demoTest.concatName(" Neoteric "," Method ");
        demoTest.concatFunc.apply(" Neoteric "," Method ");
        demoTest.countFunc.apply(" aq                                                                                                               qqqqNeoteric "," Method ");
        int length=demoTest.countFunc.apply(" Neoteric "," Method ");
        System.out.println("length"+length);

        String output = demoTest.toUpperFunc.apply("Neoteric");
        System.out.println( " toUpperCase "+output);



    }
}
