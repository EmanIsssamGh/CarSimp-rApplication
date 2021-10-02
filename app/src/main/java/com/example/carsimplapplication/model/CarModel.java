package com.example.carsimplapplication.model;

import java.util.ArrayList;

public class CarModel {
  private ArrayList<Car> carTypes = new ArrayList<>();

    public CarModel(){
        carTypes.add(new Car("SUN","Santa Fe",2017));
        carTypes.add(new Car("Sedan ","Accent",2015));
        carTypes.add(new Car("hatach-bag","Golf",2020));

    }

    public Car getByType( String type ){
        Car car = null;
        for (Car c : carTypes){
            if (c.getType().toLowerCase().equals(type.toLowerCase())){
                return c;}
        }
        return car;
    }

public String[] carsType(){
String[] Types = new String[carTypes.size()];
for( int i=0 ; i < Types.length; i++){
    Types[i]= carTypes.get(i).getType();
}
return Types;
}
}
