package com.hua;

import org.junit.Test;


interface Service {
    void doSomething();
}

@FunctionalInterface
interface Mapper {
    void say();
}


public class LambdaTest {
    @Test
    public void test() {
        Service service = new Service() {
            @Override
            public void doSomething() {
                System.out.println("walking");
            }
        };

        service.doSomething();

        Mapper mapper = () -> {
            System.out.println("Hi");
        };
        mapper.say();
    }
}
