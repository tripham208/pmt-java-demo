package vn.id.pmt.java.thead;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
                new CallableTask("Ranga"),
                new CallableTask("Adam"));
        String welcomeMessage = executorService.invokeAny(tasks);
        System.out.println(welcomeMessage);
        executorService.shutdown();
    }
}
