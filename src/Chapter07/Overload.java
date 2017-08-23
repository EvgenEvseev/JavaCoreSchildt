package Chapter07;
//Продемонстрировать перезгрузку методов
class OverloadDemo{
    void test(){
        System.out.println("Параметры отсутствуют");
    }
    //Перегружаемый метод, проверяющий наличие одного целочисленного параметра
    void test(int a){
        System.out.println("a: "+a);
    }
    //Перегрежаемый метод проверяющий наличие двух целочисленных параметоров
    void test(int a,int b){
        System.out.println("a и b: "+a+" "+b);
    }
    //Перегружаемый метод проверяющий наличие параметра типа double
    double test(double a){
        System.out.println("doublt a: "+a);
        return a*a;
    }
}
 class Overload {
    public static void main(String args[]){
        OverloadDemo ob=new OverloadDemo();
        double result;
        // вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Результат вызова ob.test(123.25): "+result);
    }
}
