package org.interfaces.specific.interfaces.than.general.interfaces;

/**
 * If your class doesn’t extend any class and inherit multiple methods
 * with same signature from multiple interfaces which belong to same hierarchy,
 * then a method from most specific interface is selected
 * (If interface X extends Y then X is more specific than Y).
 *
 * For example, In the below program, anyMethod() from InterfaceTwo is called.
 */
public class MyClass  implements InterfaceOne, InterfaceTwo {
    public static void main(String[] args) {
        new MyClass().anyMethod();
    }
}