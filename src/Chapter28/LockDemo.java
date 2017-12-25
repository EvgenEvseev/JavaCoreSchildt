package Chapter28;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock,"Один");
        new LockThread(lock,"Джва");
    }
}

class Shared3{
    static int COUNT =0;
}

class LockThread implements Runnable{
    String name;
    ReentrantLock lock;
    LockThread(ReentrantLock lk,String n){
        lock = lk;
        name=n;
        new Thread(this).start();
    }

    public void run(){
        System.out.println("Запуск потока "+name);

        try{
            System.out.println("Поток "+name+" ожидает блокировки счетчика");
            lock.lock();
            System.out.println("Поток "+name+" блокирует счетчик");
            Shared3.COUNT++;
            System.out.println("Поток "+name+": "+Shared3.COUNT);
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }finally {
            System.out.println("Поток "+name+" разблокирует счетчик ");
            lock.unlock();
        }
    }
}