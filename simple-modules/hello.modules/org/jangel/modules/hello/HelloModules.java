package org.jangel.modules.hello;

import static java.lang.System.out;

import org.jangel.modules.hello.HelloInterface;

public class HelloModules implements HelloInterface{
    public static void doSomething() {
        out.println("Hello, Modules!");
    }

    public void sayHello() {
        out.println("Hello!");
    }
}
