module hello.modules {
    exports org.jangel.modules.hello;
    provides org.jangel.modules.hello.HelloInterface with org.jangel.modules.hello.HelloModules;
}