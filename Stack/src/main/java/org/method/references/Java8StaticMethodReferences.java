package org.method.references;

import java.util.function.Function;

//Method reference to static method
public class Java8StaticMethodReferences {
    public static void main(String[] args) {
        //Calling parseInt() method using lambda
        Function<String,Integer> function = s -> Integer.parseInt(s);
        System.out.println(function.apply("12"));;

        //Calling parseInt() method using method reference
        Function<String,Integer> functionByMethodReference = Integer::parseInt;
        System.out.println(functionByMethodReference.apply("12"));;
    }
}
