package ru.oop.task3;

/**
 * Вид транспорта, можно выбрать любой(сейчас машина)
 * */

public class Car implements Transport{
    public Car(Person person) {
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
