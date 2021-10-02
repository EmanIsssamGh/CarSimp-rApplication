package com.example.carsimplapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.carsimplapplication.model.Car;
import com.example.carsimplapplication.model.CarModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

 private   Spinner spinner;
 private EditText edResult;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        edResult=findViewById(R.id.edtext);
        CarModel model = new CarModel();
//        ArrayList<Car> carTypes = new ArrayList<>();
//        carTypes.add(new Car("SUN","Santa Fe",2017));
//        carTypes.add(new Car("Sedan ","Accent",2015));
//        carTypes.add(new Car("hatach-bag","Golf",2020));
//
//String[] cars = {
//        carTypes.get(0).getType(),
//        carTypes.get(1).getType(),
//        carTypes.get(2).getType(),
//
//};
   String[] cars= model.carsType();



        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
               cars);
        ad.setDropDownViewResource(
                android.R.layout
                        .simple_spinner_dropdown_item);
        spinner.setAdapter(ad);
    }

    public void btclick(View view) {
//        System.out.println(" Button Clicked");
        String type = spinner.getSelectedItem().toString();
        CarModel model = new CarModel();
        Car c = model.getByType(type);
        if(c!= null){
            edResult.setText(c.getMakke()+", Year="+ c.getModel());
        }
        else {
            edResult.setText(" No Car Found !");
        }

    }
}