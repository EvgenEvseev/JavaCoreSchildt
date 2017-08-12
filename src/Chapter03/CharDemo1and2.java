package Chapter03;
// Продемонстрировать применение типа данных char
public class CharDemo1and2 {
    public static void main(String args[]){
        char ch1,ch2;
        ch1=88; // код символа x
        ch2='Y';
        System.out.print("ch1 и ch2: ");
        System.out.println(ch1+" "+ch2);
// символьные переменные ведут себя как целочисленные значения
        char ch4;
        ch4='X';
        System.out.println("ch4 содержит "+ch4);
        ch4++; //увеличить на единицу значение переменной ch4
        System.out.println("ch4 теперь содержит "+ch4);
    }
}
