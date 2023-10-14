// Practical 5:- Write a program in java to accept values for multithread.
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("From thread A:i=" + i);
        }
        System.out.println("Exit from thread A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 3; j++) {
            System.out.println("From thread B: j=" + j);
        }
        System.out.println("Exit from thread B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 3; k++) {
            System.out.println("From thread C: k=" + k);
        }
        System.out.println("Exit from thread C");
    }
}

public class Thread_demo {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}
