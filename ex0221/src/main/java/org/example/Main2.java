package org.example;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Runnable taks1 = ()->{
            for(int i=0; i<1000; i++){
                count.incre();
            }
        };

        Runnable taks2 = ()->{
            for(int i=0; i<1000; i++){
                count.decre();
            }
        };

        Thread t1 = new Thread(taks1);
        Thread t2 = new Thread(taks2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(count.getCnt());

    }
}
