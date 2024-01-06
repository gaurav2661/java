package org.lambda.expressions;

@FunctionalInterface
public interface Comparator<T> {
    int compare(T object1,T object2);
}
