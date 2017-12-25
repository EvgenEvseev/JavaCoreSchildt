package Chapter28;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String>exgr=new Exchanger<>();
        new UseString(exgr);
        new MakeString(exgr);
    }
}

class MakeString implements Runnable{
    Exchanger<String>ex;
    String st;
    MakeString(Exchanger<String >c){
        ex=c;
        st=new String();
        new Thread(this).start();
    }
    public void run(){
        char ch='A';
        for(int i=0;i<3;i++){
        for(int j=0;j<5;j++)st+=(char)ch++;
        try{
            st=ex.exchange(st);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        }
    }
}

class UseString implements Runnable{
    Exchanger<String>ex;
    String str;
    UseString(Exchanger<String>c){
        ex=c;
        new Thread(this).start();
    }
    public void run(){
        for(int i=0;i<3;i++){
            try{
                str=ex.exchange(new String());
                System.out.println("Получено "+str);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}