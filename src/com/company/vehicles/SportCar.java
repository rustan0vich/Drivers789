package com.company.vehicles;

import com.company.details.Engine;
import com.company.professoins.Driver;

public class SportCar extends Car{
    private int kmh;
    public SportCar(String carmarck, String carclass, int kg, Driver driver, Engine engine) {
        super(carmarck, carclass, kg, driver, engine);
    }
}
