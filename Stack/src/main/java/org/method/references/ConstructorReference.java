package org.method.references;

import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args)
    {
        //Creating objects using lambda

        Supplier<ConstructorReference> lambdaSupplier = () -> new ConstructorReference();
        lambdaSupplier.get();

        //Creating objects using constructor references

        Supplier<ConstructorReference> referenceSupplier = ConstructorReference::new;
        referenceSupplier.get();
    }
}
