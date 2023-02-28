package com.company.vehicles;

import com.company.details.Engine;
import com.company.professoins.Driver;

public class Car {
    private String carmarck;
    private String carclass;
    private int kg;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали");
    }
    public  void stop(){
        System.out.println("Останавливаемся");
    }
    public  void turnRight(){
        System.out.println("Поворот на право");
    }
    public  void turnLeft(){
        System.out.println("Поворот налево");
    }

    public Car(String carmarck, String carclass, int kg, Driver driver, Engine engine) {
        this.carmarck = carmarck;
        this.carclass = carclass;
        this.kg = kg;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarmarck() {
        return carmarck;
    }

    public void setCarmarck(String carmarck) {
        this.carmarck = carmarck;
    }

    public String getCarclass() {
        return carclass;
    }

    public void setCarclass(String carclass) {
        this.carclass = carclass;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return   " "+ carmarck + '\'' +
                 " "+ carclass + '\'' +
                " "+ kg +
                " "+ driver +
                " "+ engine
                ;
    }
}
