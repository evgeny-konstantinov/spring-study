package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestIntroduction {

    @DeclareParents(value = "org.example.MusicPlayer", defaultImpl = MoveableImpl.class)
    public static Moveable moveable;
}
