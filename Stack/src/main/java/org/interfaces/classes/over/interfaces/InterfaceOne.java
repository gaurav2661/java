package org.interfaces.classes.over.interfaces;

interface InterfaceOne {
    default void anyMethod() {
        System.out.println("Hi... From Interface One");
    }
}
