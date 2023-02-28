package com.company.vehicles;

import com.company.details.Engine;
import com.company.professoins.Driver;

public class Lorry extends Car{
    private int gruz;
    public Lorry(String carmarck, String carclass, int kg, Driver driver, Engine engine,int gruz) {
        super(carmarck, carclass, kg, driver, engine);
        this.gruz=gruz;
    }
}
