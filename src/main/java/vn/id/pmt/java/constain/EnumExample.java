package vn.id.pmt.java.constain;

import java.util.List;
import lombok.Getter;

/**
 * Example data for test
 */
public enum EnumExample {

    ;
    @Getter
    private final List<String> stringList = List.of("Apple", "Banana", "Cat", "Dog");
}

