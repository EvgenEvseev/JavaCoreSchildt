package Chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transform extends RecursiveAction{
    int seqThreshold;
    double[]data;
    int star,end;
    Transform(double[]vals,int s,int e,int t){
        data=vals;
        star=s;
        end=e;
        seqThreshold=t;
    }

    @Override
    protected void compute() {
        if((end-star)<seqThreshold){
            for(int i=star;i<end;i++){
                if((data[i]%2)==0)data[i]=Math.sqrt(data[i]);
                else data[i]=Math.cbrt(data[i]);
            }
        }else {
            int middle=(star+end)/2;
            invokeAll(new Transform(data,star,middle,seqThreshold),new Transform(data,middle,end,seqThreshold));
        }
    }
}
public class FJExpetiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if(args.length!=2){
            System.out.println("Использованиe FJExperiment c аргументами возможно только (с) Йода");
            return;
        }

        pLevel=Integer.parseInt(args[0]);
        threshold=Integer.parseInt(args[1]);

        long BeginT,EndT;

        ForkJoinPool fjp=new ForkJoinPool(pLevel);

        double[]nums=new double[1000000];

        for(int i=0;i<nums.length;i++)nums[i]=(double)i;

        Transform task = new Transform(nums,0,nums.length,threshold);

        BeginT= System.nanoTime();

        fjp.invoke(task);

        EndT=System.nanoTime();
        System.out.println("Уровень параллелизма "+pLevel);
        System.out.println("Порог последовательной обработки "+threshold);
        System.out.println("Истекшее время "+(EndT-BeginT)+" наносекунд");
        System.out.println();
    }
}
