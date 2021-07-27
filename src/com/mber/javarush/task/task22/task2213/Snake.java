package com.mber.javarush.task.task22.task2213;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private final List<SnakeSection> sections;
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        this.sections = new ArrayList<>();
        this.sections.add(new SnakeSection(x, y));
        this.isAlive = true;
    }

    /**
     * Метод проверяет - находится ли новая голова в пределах комнаты
     */
    void checkBorders(SnakeSection head) {
        if ((head.getX() < 0 || head.getX() >= Room.game.getWidth())
                || head.getY() < 0 || head.getY() >= Room.game.getHeight()) isAlive = false;
    }

    /**
     * Метод проверяет - не совпадает ли голова с каким-нибудь участком тела змеи.
     */
    void checkBody(SnakeSection head) {
        if (sections.contains(head)) isAlive = false;
    }

    public int getX() {
        return this.sections.get(0).getX();
    }

    public int getY() {
        return this.sections.get(0).getY();
    }

    /**
     * Метод перемещает змею на один ход.
     * Направление перемещения задано переменной direction.
     */
    public void move() {
        if (!isAlive) return;
        if (direction == SnakeDirection.UP) move(0, -1);
        else if (direction == SnakeDirection.RIGHT) move(1, 0);
        else if (direction == SnakeDirection.DOWN) move(0, 1);
        else if (direction == SnakeDirection.LEFT) move(-1, 0);
    }

    /**
     * Метод перемещает змею в соседнюю клетку.
     * Координаты клетки заданы относительно текущей головы с помощью переменных (dx, dy).
     */
    private void move(int dx, int dy) {
        //Создаем новую голову - новый "кусочек змеи".
        SnakeSection head = sections.get(0);
        head = new SnakeSection(head.getX() + dx, head.getY() + dy);

        //Проверяем - не вылезла ли голова за границу комнаты
        checkBorders(head);
        if (!isAlive) return;

        //Проверяем - не пересекает ли змея  саму себя
        checkBody(head);
        if (!isAlive) return;

        //Проверяем - не съела ли змея мышь.
        Mouse mouse = Room.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY()) //съела
        {
            sections.add(0, head);                  //Добавили новую голову
            Room.game.eatMouse();                   //Хвост не удаляем, но создаем новую мышь.
        } else //просто движется
        {
            sections.add(0, head);                  //добавили новую голову
            sections.remove(sections.size() - 1);   //удалили последний элемент с хвоста
        }
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }
}
