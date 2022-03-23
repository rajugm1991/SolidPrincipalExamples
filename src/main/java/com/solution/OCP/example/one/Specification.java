package com.solution.OCP.example.one;

public interface Specification<T> {

    boolean isSatisfied(T t);
}
