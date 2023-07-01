package vn.id.pmt.java.exception;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class TryWithResourcesRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // auto close
            // ... Program logic, probably using scanner input
            int[] numbers = {1, 2, 3, 4};
            int num = numbers[5];
        }
        //scanner.close();

        /*
        try {
            int a = 1;

        } catch (IOException | SQLException ex) {
            ex.printStackTrace();
        }
        */

    }
}