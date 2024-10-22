package ru.oop.task2;
/**
 * Транспорт
 * */
public interface Transport extends Positioned {
    /**
     * Доехать до места назначения
     * @param destination место назначения
     * */
    void drive(Position destination);
}
