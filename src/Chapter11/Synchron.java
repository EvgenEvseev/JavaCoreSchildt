package Chapter11;
class callme{
    synchronized void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}

class caller implements Runnable{
    String msg;
    callme target;
    Thread t;

    public caller(callme targ,String s){
        target =targ;
        msg = s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}

public class Synchron {
    public static void main(String[] args) {
        try{     callme target = new callme();
        caller ob2=new caller(target,"Добро пожаловать");
        caller ob1=new caller(target,"в синхронизированный");
        caller ob3=new caller(target,"мир !");


            ob2.t.join();
            ob1.t.join();
            ob3.t.join();

        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
