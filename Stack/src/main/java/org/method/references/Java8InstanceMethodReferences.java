package org.method.references;

import java.util.function.Function;

//Method reference to instance method (ClassName::MethodName)
public class Java8InstanceMethodReferences {
    public static void main(String[] args) {
        //Calling toLowerCase() method using lambda
        Function<String,String> function = (String s) -> s.toLowerCase();
        System.out.println(function.apply("JAVA"));;

        //Calling toLowerCase() method using method reference
        Function<String,String> functionByMethodReference = String::toLowerCase;
        System.out.println(functionByMethodReference.apply("JAVA"));;
    }
}
