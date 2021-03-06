package com.solution.OCP.example.one;

import com.problem.COP.example.one.productfilter.Product;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilterNew implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> products, Specification<Product> specification) {
        return products.stream().filter(product -> specification.isSatisfied(product));
    }
}
