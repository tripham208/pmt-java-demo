package vn.id.pmt.java.fp;

import java.util.List;
import java.util.function.Predicate;

public class ExampleDataClass {
    final public static List<String> stringList = List.of("Apple", "Banana", "Cat", "Dog");
    final public static List<Integer> intList = List.of(1, 3, 5, 7, 8);
    /**
     *  function as variable
     */
    final public static Predicate<? super Integer> evenP = n -> n % 2 == 0;
}
