package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MethodLoggerEntryPoint {
    @Pointcut("execution(* *(..))")
    public void defineEntryPoint() {}

    @Before("defineEntryPoint()")
    public void log(JoinPoint thisJoinPoint) {
        final String joinPointName = thisJoinPoint.getThis().getClass().getSimpleName() + "." + thisJoinPoint.getSignature().getName() + "()";
        System.out.println("Entering [" + joinPointName + "]");
       // System.out.println("Before advice on " + thisJoinPoint);
    }

    @After("execution(* *(..))")
    public void afterAdvice(JoinPoint thisJoinPoint) {
        final String joinPointName = thisJoinPoint.getThis().getClass().getSimpleName() + "." + thisJoinPoint.getSignature().getName() + "()";
        System.out.println("Leaving  [" + joinPointName + "]");
        //System.out.println("After advice on " + thisJoinPoint);
    }
}