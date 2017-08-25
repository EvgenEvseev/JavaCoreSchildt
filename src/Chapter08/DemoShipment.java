package Chapter08;
class Box2{
    private double width;
    private double height;
    private double depth;
    // конструирование клона объекта
    Box2(Box2 obj){//  передача объекта конструктору
        width=obj.width;
        height=obj.height;
        depth=obj.depth;
    }
    //Конструктор для указания размеров
    Box2(double w,double h,double d){
        width =w;
        height=h;
        depth=d;
    }
    //Конструктор при отсутствии размеров
    Box2(){
        width=-1;
        height=-1;
        depth=-1;
    }
    //Конструктор для куба
    Box2(double len){
        width=depth=height=len;
    }
    //рассчет и возврат объема
    double volume(){
        return width*height*depth;
    }
}
//Теперь в классе NewBox1 реализованы все конструкторы
class NewBox2 extends Box2{
    double weight;//вес параллелепипеда
    //передача объекта конструктору
    NewBox2(NewBox2 obj){
        super(obj);
        weight= obj.weight;
    }
    NewBox2(double w, double h,double d,double m){
        super(w,h,d);//вызов конструктора из суперкласса
        weight=m;
    }
    //конструктор, применяемый по умолчанию
    NewBox2(){
        super();
        weight=-1;
    }
    //конструктор для куба
    NewBox2(double len,double m){
        super(len);
        weight=m;
    }
}
//добавить поле стоимости доставки
class Shipment extends NewBox2{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }
    Shipment(double w,double h,double d,double m,double c){
        super(w,h,d,m);
        cost = c;
    }
    Shipment(){
        super();
        cost=-1;
    }
    Shipment(double len,double m,double c){
        super(len,m);
        cost = c;
    }
}
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1=new Shipment(10,20,15,10,3.41);
        Shipment shipment2=new Shipment(2,3,4,0.76,1.28);
        double vol;

        vol=shipment1.volume();
        System.out.println("Объем shipment1 равен "+vol);
        System.out.println("Вес shipment1 равен "+shipment1.weight);
        System.out.println("Стоимость доставки: $"+shipment1.cost);
        System.out.println();

        vol=shipment2.volume();
        System.out.println("Объем shipment2 равен "+vol);
        System.out.println("Вес shipment2 равен "+shipment2.weight);
        System.out.println("Стоимость доставки: $"+shipment2.cost);
    }
}
