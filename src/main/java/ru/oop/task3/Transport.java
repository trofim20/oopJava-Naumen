package ru.oop.task3;
/**
 * Транспорт
 * */
public interface Transport extends Positioned{
    /**
     * Доехать до места назначения
     * @param destination место назначения
     * */
    void drive(Position destination);
}
