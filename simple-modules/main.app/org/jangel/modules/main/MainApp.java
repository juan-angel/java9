package org.jangel.modules.app;

import org.jangel.modules.hello.HelloModules;
import org.jangel.modules.hello.HelloInterface;


public class MainApp {
    public static void main(String[] args) {
        HelloModules.doSomething();
        HelloInterface helloInterface = new HelloModules();
        helloInterface.sayHello();
    }
}
