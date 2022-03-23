package com.problem.COP.example.one.productfilter;

import com.solution.OCP.example.one.ColorSpecification;
import com.solution.OCP.example.one.Combinator;
import com.solution.OCP.example.one.ProductFilterNew;
import com.solution.OCP.example.one.SizeSpecification;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product p=new Product("Apple", Color.GREEN,Size.SMALL);
        Product p2=new Product("Samsung",Color.RED,Size.LARGE) ;
        Product p3=new Product("XINO", Color.GREEN,Size.SMALL);

        List<Product> products= Arrays.asList(p,p2,p3);
        ProductFilter productFilte=new ProductFilter();
        System.out.println("Breaked COP rule");
        productFilte.filterProductsByColor(products,Color.GREEN).forEach(pr->System.out.println(" "+pr.getName() +" is green product"));

        ProductFilterNew productFilterNew=new ProductFilterNew();
        productFilterNew.filter(products,new SizeSpecification(Size.LARGE)).
                forEach(p1->System.out.println(p1.getName()+ " is large size"));
        productFilterNew.filter(products,new ColorSpecification(Color.GREEN)).
                forEach(p1->System.out.println(p1.getName()+ " is green product"));

        productFilterNew.filter(products,new Combinator<>(new ColorSpecification(Color.RED),new SizeSpecification(Size.LARGE))).forEach(
                g->System.out.println(g.getName()+ " is in red color and in large size")
        );
    }
}
