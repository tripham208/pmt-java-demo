package vn.id.pmt.java.thead;

import java.util.List;
import java.util.concurrent.*;


public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
                new CallableTask("Ranga"),
                new CallableTask("Adam"));
        List<Future<String>> welcomeAll = executorService.invokeAll(tasks);
        for (Future<String> welcomeFuture : welcomeAll) {
            System.out.println(welcomeFuture.get());
        }
        executorService.shutdown();
    }


}

