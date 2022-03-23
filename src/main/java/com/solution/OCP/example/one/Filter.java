package com.solution.OCP.example.one;


import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {

    Stream<T> filter(List<T> products, Specification<T> specification);
}
