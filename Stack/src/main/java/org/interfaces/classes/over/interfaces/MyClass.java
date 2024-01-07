package org.interfaces.classes.over.interfaces;

/**
 * If your class inherit multiple methods with same signature then a method from super class
 * is selected (Remember a class can inherit only one class).
 *
 * For example, in the below program, anyMethod() from ClassOne is called.
 */
public class MyClass extends ClassOne implements InterfaceOne, InterfaceTwo {
    public static void main(String[] args) {
        new MyClass().anyMethod();
    }
}