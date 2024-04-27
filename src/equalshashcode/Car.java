package equalshashcode;

import swiggydemo.Restaurant;

public class Car {
    public String name;
@Override
    public boolean equals(Object obj){
        if (this==obj){
        return true;

    }
    if(this.getClass()!=obj.getClass()){
        return false;


    }
    Car car=(Car) obj;
    return this.name.equals(car.name);

}
@Override
public int hashCode(){
        return this.name.hashCode();
}


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
