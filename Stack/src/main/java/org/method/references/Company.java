package org.method.references;

import java.util.function.Supplier;

//Method reference to instance method (ReferenceVariable::MethodName)
public class Company {
    String name;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Company company = new Company("MY_COMPANY");
        //Calling getName() of c using lambda
        Supplier<String> companyNameSupplier = () -> company.getName();
        System.out.println(companyNameSupplier.get());

        //Calling getName() of c using method reference
        Supplier<String> companyNameSupplier1 = company::getName;
        System.out.println(companyNameSupplier1.get());
    }
}
