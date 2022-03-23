package com.solution.OCP.example.one;

import com.problem.COP.example.one.productfilter.Color;
import com.problem.COP.example.one.productfilter.Product;

public class ColorSpecification implements Specification<Product>{

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return this.color==product.getColor();
    }
}
