package org.interfaces.classes.over.interfaces;

public interface InterfaceTwo extends InterfaceOne{
    default void anyMethod() {
        System.out.println("Hi... From Interface Two");
    }
}
