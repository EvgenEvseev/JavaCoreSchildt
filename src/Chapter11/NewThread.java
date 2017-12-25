package Chapter11;

import com.sun.org.apache.bcel.internal.generic.NEW;

class NewThread1 extends Thread {
         Thread t;
         NewThread1() {
             t = new Thread(this, "Демонстрационный поток");
             System.out.println("Дочерний поток создан " + t);
             t.start();
         }

     public void run() {
         try {
             for (int i = 5; i > 0; i--) {
                 System.out.println("Дочерний поток " + i);
                 Thread.sleep(500);
             }
         } catch (InterruptedException e) {
             System.out.println(e);
         }
         System.out.println("Дочерний поток завершен");
     }
 }

 class ThreadDemo{
     public static void main(String[] args) {
         new NewThread1();
         try{
             for(int i=5;i>0;i--){
                 System.out.println("Главный поток "+i);
                 Thread.sleep(1000);
             }
         }catch (InterruptedException e){
             System.out.println(e);
         }
         System.out.println("Главный поток завершен");
     }
 }
