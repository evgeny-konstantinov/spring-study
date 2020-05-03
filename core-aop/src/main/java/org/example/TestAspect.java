package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

    @Before("org.example.TestAspect.testPointcut()")
    public void log(JoinPoint joinPoint) {
        System.out.println("aspect + " + joinPoint);
    }

    @Pointcut("args(org.example.Music)")
    public void testPointcut() {
    }
}