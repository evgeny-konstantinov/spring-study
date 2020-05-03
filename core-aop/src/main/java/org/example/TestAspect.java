package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {

    @Around("org.example.TestAspect.testPointcut()")
    public Volume log(ProceedingJoinPoint joinPoint) {
        System.out.println("aspect");
        //  Object proceed = joinPoint.proceed();
        return new VolumeImpl().setVolume(80);
    }

    @Pointcut("bean(musicPlayer) && execution(* getVolume(..))")
    public void testPointcut() {
    }
}