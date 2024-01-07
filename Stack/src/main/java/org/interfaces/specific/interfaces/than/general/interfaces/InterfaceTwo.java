package org.interfaces.specific.interfaces.than.general.interfaces;

public interface InterfaceTwo extends InterfaceOne {
    default void anyMethod() {
        System.out.println("Hi... From Interface Two");
    }
}
