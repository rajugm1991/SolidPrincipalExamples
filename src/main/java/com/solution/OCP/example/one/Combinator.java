package com.solution.OCP.example.one;

public class Combinator<T> implements Specification<T> {
    private Specification<T> first,second;

    public Combinator(Specification<T> first,Specification<T> second){
        this.first=first;
        this.second=second;
    }

    @Override
    public boolean isSatisfied(T t) {
        return first.isSatisfied(t)&&second.isSatisfied(t);
    }
}
