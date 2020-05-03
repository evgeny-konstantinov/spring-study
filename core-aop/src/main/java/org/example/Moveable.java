package org.example;

public interface Moveable {
    void move();
}

//@Component
class MoveableImpl implements Moveable {

    @Override
    public void move() {
        System.out.println("Moving!");
    }
}

