package com.solution.OCP.example.one;

import com.problem.COP.example.one.productfilter.Product;
import com.problem.COP.example.one.productfilter.Size;

public class SizeSpecification implements Specification<Product>{

    public Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }


    @Override
    public boolean isSatisfied(Product product) {
        return size==product.getSize();
    }
}
