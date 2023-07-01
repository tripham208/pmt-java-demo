package vn.id.pmt.java.constain;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Season2.SUMMER.name());
        System.out.println(Season2.SUMMER.ordinal());
        System.out.println(Season2.SUMMER.getValue());
        System.out.println(Arrays.toString(Season2.values()));
    }
}
