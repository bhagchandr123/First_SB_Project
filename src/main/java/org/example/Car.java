package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String color;
    public Car() {

        this.color = "Golden";
        System.out.println("Car object created!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String red) {
        this.color = "red";
    }
}
