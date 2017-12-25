package Chapter28;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        try {
            Thread.sleep(1);
            new AtomThread("1");

            new AtomThread("22");

            new AtomThread("333");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}


class Shared2{
    static AtomicInteger ai= new AtomicInteger(0);
}

class AtomThread implements Runnable{
    String name;
    AtomThread(String n){
        name=n;
        new Thread(this).start();
    }
    public void run(){

        for(int i=1;i<=5;i++){
            System.out.println("Поток "+name+" получено :"+Shared2.ai.getAndSet(i));
        }
    }
}