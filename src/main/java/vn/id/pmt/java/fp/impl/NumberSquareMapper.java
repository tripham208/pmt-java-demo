package vn.id.pmt.java.fp.impl;


import java.util.function.Function;

public class NumberSquareMapper implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}
