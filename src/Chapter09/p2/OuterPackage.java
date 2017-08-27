package Chapter09.p2;

import Chapter09.p1.Protection;

class OuterPackage {
    OuterPackage(){
        Protection p =new Protection();
        System.out.println("конструктор из другого пакета");
        // доступно только для данного класса или пакета
        //System.out.println("n = "+n);
        //
        //доступно только для данного класса
        //System.out.println("n_pri = "+p.n_pri);
        //
        // доступно только для данного класса, подкласса или пакета
        //System.out.println("n_pro = "+n_pro);

        System.out.println("n_pub = "+p.n_pub);


    }
}
