package com.example;
import java.util.List;

public class Lion {

    public boolean hasMane;
    public Predator predator; //  объект predator — это поле класса Lion
    public Lion(Predator predator) {  // Объект передаётся в конструктор. Он создан извне класса
        this.predator = predator; // объект попадает в переменную класса
    }

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    Feline feline = new Feline();

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
