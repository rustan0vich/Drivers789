package com.company.details;

public class Engine {
    private int HP;
    private String proizvoditel;

    public Engine(int HP, String proizvoditel) {
        this.HP = HP;
        this.proizvoditel = proizvoditel;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    @Override
    public String toString() {
        return
                 HP +
               "  "+proizvoditel
                ;
    }
}
