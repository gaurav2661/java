package org.interfaces.specific.interfaces.than.general.interfaces;

interface InterfaceOne {
    default void anyMethod() {
        System.out.println("Hi... From Interface One");
    }
}
