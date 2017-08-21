package Chapter06;
// в этой программе объявляются два объекта класса Box

class BoxDemo2 {
    public static void main(String args[]){
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        // присваивание значения переменным экземпляра mybox1
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        //присваивание других значений переменным экземпляра mybox2
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
//расчет объема первого параллелепипеда
        vol=mybox1.width*mybox1.height*mybox1.depth;
        System.out.println("Объем равен "+vol);
//расчет объема второго параллелепипеда
        vol=mybox2.width*mybox2.height*mybox2.depth;
        System.out.println("Объем равен "+vol);
    }
}
