package ru.oop.task2;

import com.sun.jdi.connect.Transport;
/**
 * Вид транспорта, можно выбрать любой(сейчас Мотоцикл)
 * */
public class Motorbike implements Transport {
    /**
     * Конструктор класса
     * @param person человек
     * */
    public Motorbike(Person person) {
    }
    @Override
    /**
     * Место нахождения транспорта
     * */
    public Position getPosition(){
        return null;
    }

    @Override
    /**
     * Доехать до места назначения
     * @param destination место назначения
     * */
    public void drive(Position destination){

    }
}
