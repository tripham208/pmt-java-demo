package vn.id.pmt.java.fp;

import static vn.id.pmt.java.fp.Function.Type;

public class Main {

    public static void main(String[] args) {
        int index = 1;

        switch (index) {
            case 1:
                Function.printLoopFunction(ExampleDataClass.stringList, Type.LAMBDA); // change type which you want
                System.out.println();
                Function.printFilterFunction(ExampleDataClass.stringList, Type.METHOD_REFERENCE);
                System.out.println();
                Function.printReduceFunction(ExampleDataClass.intList, Type.LAMBDA);
                System.out.println();
                Function.printCollectFunction(ExampleDataClass.intList, Type.MAX_OPERATION);
                System.out.println();
                Function.printCollectFunction(ExampleDataClass.intList, Type.TO_LIST_OPERATOR);
            case 2:
                break;

            default:
                return;
        }
    }
}
