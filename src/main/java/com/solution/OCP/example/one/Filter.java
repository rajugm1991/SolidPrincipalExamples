package com.solution.OCP.example.one;


import java.util.List;
import java.util.stream.Stream;

public interface FilterSpecification<T> extends Specification<T> {

    Stream<T> filter(List<T> products, Specification specification);
}
