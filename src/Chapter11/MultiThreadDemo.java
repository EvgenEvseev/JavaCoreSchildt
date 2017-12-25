package Chapter11;

class NewThread2 implements Runnable{
    String name;
    Thread t;
    NewThread2(String threadname){
        name=threadname;
        t=new Thread(this,name);
        System.out.println("Новый поток "+t);
        t.start();
    }

    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(name+" завершен");
    }
}
public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("Первый");
        new NewThread2("Второй");
        new NewThread2("Третий");

        try{
            Thread.sleep(3550);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Главный поток усё");
    }
}
