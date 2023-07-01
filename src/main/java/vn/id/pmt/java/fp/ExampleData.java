package vn.id.pmt.java.fp;

import java.util.List;
import lombok.Getter;

/**
 * Example data for test
 */
public enum ExampleData {

    ;
    @Getter
    private final List<String> stringList = List.of("Apple", "Banana", "Cat", "Dog");
}
