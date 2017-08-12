package Chapter02;
/* Продемонстрировать применение блока кода. Присвоить исходному файлу имя "SomeListing5.java"

 */
public class BlockTest {
    public static void main(String args[]){
        int x,y;
        y=20;
        // адресатом этого оператора служит блок кода
        for(x=0;x<10;x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
    }
}
