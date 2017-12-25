package Chapter28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser{
    int numPhases;

    MyPhaser(int parties,int phaseCount){
        super(parties);
        numPhases=phaseCount-1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Фаза "+phase+" завершена\n");
        return phase == numPhases ;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr=new MyPhaser(1,7);
        System.out.println("Запуск потоков\n");

        new MyThread4(phsr,"A");
        new MyThread4(phsr,"B");
        new MyThread4(phsr,"C");
        new MyThread4(phsr,"D");

        while (!phsr.isTerminated()){
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("Синхронизатор фаз завершен");
    }
}

class MyThread4 implements Runnable{
    Phaser phsr;
    String name;

    MyThread4(Phaser p,String n){
        phsr=p;
        name=n;
        phsr.register();
        new Thread(this).start();
    }
    public void run(){
        while(!phsr.isTerminated()){
            System.out.println("Поток "+name+ " начинает фазу "+phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            try{
                Thread.sleep(150);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
