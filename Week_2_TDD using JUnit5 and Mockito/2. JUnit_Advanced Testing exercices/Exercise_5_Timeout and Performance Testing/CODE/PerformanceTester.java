package org.example;
public class PerformanceTester {
    public void performTask() {
        // Simulating a task that takes some time
        try {
            Thread.sleep(300);  // 300 milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
