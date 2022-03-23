package com.problem.COP.example.one.productfilter;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    /**
     * The problem is with here if today this codes pushed to prod tommorow client comes and ask with combination filter or
     * anything for that again we have to modification of this class . This is bad we are voilating the COP princepal.
     * Our class should only open for extenstion and closed for modification
     *
     * @param products
     * @param color
     * @return
     */
    public Stream<Product> filterProductsByColor(List<Product> products,Color color){
        return products.stream().filter(p->p.getColor()==color);
    }

    public Stream<Product> filterProductsBySize(List<Product> products,Size size){
        return products.stream().filter(p->p.getSize()==size);
    }
}
