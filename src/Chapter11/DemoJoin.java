package Chapter11;
class NewThread3 implements Runnable{
    String name;
    Thread t;
    NewThread3(String threadname){
        name=threadname;
        t=new Thread(this,name);
        System.out.println("Новый потокс "+name);
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
        System.out.println(name+" завершен !!!");
    }
}



public class DemoJoin {
    public static void main(String[] args) {
        NewThread3 ob1=new NewThread3("Один");
        NewThread3 ob2=new NewThread3("Два");
        NewThread3 ob3=new NewThread3("Три");

        System.out.println("Поток Один запущен "+ob1.t.isAlive());
        System.out.println("Поток Два запущен "+ob2.t.isAlive());
        System.out.println("Поток Три запущен "+ob3.t.isAlive());

        try{
            System.out.println("Ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Поток Один запущен "+ob1.t.isAlive());
        System.out.println("Поток Два запущен "+ob2.t.isAlive());
        System.out.println("Поток Три запущен "+ob3.t.isAlive());

        System.out.println("Главный поток завершен");
    }
}
