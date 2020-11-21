package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MethodLogger extends AbstractMethodLogger {

    /**
     * Will log every execution of
     * <ul>
     * <li>every method calls</li>
     * </ul>
     * excluding any test classes.
     */
    @Pointcut("(execution(* *.*(..)) || execution(* *.*()))")
    protected void logging() {
    }

    //@Around("logging()")
    public Object logMethodCalls(final ProceedingJoinPoint thisJoinPoint) throws Throwable {
        final String joinPointName = thisJoinPoint.getThis().getClass().getSimpleName() + "." + thisJoinPoint.getSignature().getName() + "()";
        System.out.println("Entering [" + joinPointName + "]");
        thisJoinPoint.proceed();
        System.out.println("Leaving  [" + joinPointName + "]");
        return null;
    }

}
