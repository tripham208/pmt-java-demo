package vn.id.pmt.java.fp;


import vn.id.pmt.java.fp.impl.EvenNumberPredicate;
import vn.id.pmt.java.fp.impl.NumberSquareMapper;
import vn.id.pmt.java.fp.impl.SysOutConsumer;

import java.util.List;
import java.util.stream.Collectors;

public class Function {

    static class Type {
        final public static int LAMBDA = 1;
        final public static int METHOD_REFERENCE = 2;
        final public static int MAX_OPERATION = 11;
        final public static int TO_LIST_OPERATOR = 13;
        public static final int CUSTOM = 20;
    }

    public static void printLoopFunction(List<String> list, int type) {
        switch (type) {
            case Type.METHOD_REFERENCE -> list.stream().forEach(System.out::println);
            case Type.LAMBDA -> list.stream().forEach(e -> System.out.println(e));
            default -> {
                return;
            }
        }
    }

    public static void printFilterFunction(List<String> list, int type) {
        switch (type) {
            case Type.METHOD_REFERENCE -> {
                list.stream().filter(elem -> elem.endsWith("at")).forEach(System.out::println);
            }
            case Type.LAMBDA -> {
            }
            default -> {
                return;
            }
        }
    }

    public static void printReduceFunction(List<Integer> list, int type) {
        switch (type) {
            case Type.LAMBDA -> {
                list.stream().reduce(
                        0, (n1, n2) -> {
                            System.out.println(n1 + " " + n2);
                            return n1 + n2;
                        }
                );
            }
            case Type.METHOD_REFERENCE -> {
            }
            default -> {
                return;
            }
        }
    }

    public static void printCollectFunction(List<Integer> list, int type) {
        switch (type) {
            case Type.MAX_OPERATION -> {
                System.out.println(list.stream().max(Integer::compare).get());
            }
            case Type.TO_LIST_OPERATOR -> {
                System.out.println(list.stream().collect(Collectors.toList()));
            }
            default -> {
                return;
            }
        }
    }

    public static void printCustomFunction(List<Integer> list, int type) {
        switch (type) {
            case Type.CUSTOM -> {
                list.stream()
                        .filter(new EvenNumberPredicate())
                        .map(new NumberSquareMapper())
                        .forEach(new SysOutConsumer());
            }
            case Type.TO_LIST_OPERATOR -> {
            }
            default -> {
                return;
            }
        }
    }


}
