package com.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public abstract class AbstractMethodLogger {
    private final int width = 2;
    private int indent = 0;

    @Pointcut
    protected abstract void logging();

    @Before("logging()")
    public void increaseIndent() {
        this.indent++;
    }

    @After("logging()")
    public void decreaseIndent() {
        this.indent--;
    }

    @Before("call(* java.io.PrintStream.println(..))")
    public void print() {
        for (int spaces = 0, indent = this.indent * this.width; spaces < indent; spaces++) {
            System.out.print(" ");
        }
    }
}
