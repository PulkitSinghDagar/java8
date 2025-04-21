package ConcurrentCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationProblem {

    ///in this we are working on concurrent modification on thread as arraylist cant do it
    // we can use copyonarraylist to get away from this
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        // Thread to read elements from the list
        Thread readThread = new Thread(() -> {
            System.out.println("Read thread starts");
            for (String str : list) {
                System.out.println("Read: " + str);
            }
        });

        // Thread to modify the list
        Thread writeThread = new Thread(() -> {
            System.out.println("Write thread starts");
            list.add("four");
            System.out.println("Added: four");
        });

        // Start threads
        readThread.start();
        writeThread.start();
    }
}
