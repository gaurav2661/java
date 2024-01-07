package org.interfaces.interfaceName.superKeyword.methodName;

/**
 * If your class doesn’t extend any class and inherit multiple methods with same signature from multiple interfaces
 * which doesn’t belong to same hierarchy, then override that method and from within body explicitly call
 * desired method as InterfaceName.super.methodName().
 *
 * For example, in the below program, anyMethod() from InterfaceOne is called explicitly.
 */
public class MyClass implements InterfaceOne, InterfaceTwo {
    @Override
    public void anyMethod() {
        InterfaceOne.super.anyMethod();
    }
    public static void main(String[] args) {
        new MyClass().anyMethod();
    }
}