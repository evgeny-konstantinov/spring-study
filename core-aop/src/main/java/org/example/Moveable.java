package org.example;

import org.springframework.stereotype.Component;

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

