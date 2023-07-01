package vn.id.pmt.java.fp.impl;

import java.util.function.Consumer;

public class SysOutConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer num) {
        System.out.println(num);
    }
}