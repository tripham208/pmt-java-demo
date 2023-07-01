package vn.id.pmt.java.thead;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 Started ");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask1 Done");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 Started ");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 Done");
    }
}


public class ExecutorServiceRunner {

    public static void main(String[] args) {
        test1();
    }

    /**
     * single thread
     * task1 |-> task2 song song main (task3)
     */
    public static void test1() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));
        System.out.print("\nTask3 Kicked Off\n");

        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 Done");
        System.out.println("\nMain Done");
        executorService.shutdown();
    }
}
