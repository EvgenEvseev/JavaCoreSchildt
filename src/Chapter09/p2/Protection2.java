package Chapter09.p2;

import Chapter09.p1.Protection;

class Protection2 extends Protection {
    Protection2(){
        System.out.println("Конструктор унаследованный из другого пакета");
        //доступно только для давнного класса или пакета
        //System.out.println("n= "+n);
        //доступно только для данного класса
        //System.out.println("n_pri= "+n_pri);
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);

    }
}