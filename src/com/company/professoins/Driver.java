package com.company.professoins;

public class Driver {
    private String fio;
    private int staj;

    public Driver(String fio, int staj) {
        this.fio = fio;
        this.staj = staj;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }

    @Override
    public String toString() {
        return
                 fio +
                 "  "+staj
                ;
    }
}
