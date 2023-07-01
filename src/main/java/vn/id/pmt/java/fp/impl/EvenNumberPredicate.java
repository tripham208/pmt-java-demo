package vn.id.pmt.java.fp.impl;

import java.util.function.Predicate;

public class EvenNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return (number%2 == 0);
    }
}