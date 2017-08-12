package Chapter03;
//Продемонстрировать применение одномерного массива
public class Array {
    public static void main(String args[]){
        int cat_massive[]=new int[9];
        cat_massive[0]=12;
        cat_massive[1]=17;
        cat_massive[2]=24;
        cat_massive[3]=43;
        cat_massive[4]=35;
        cat_massive[5]=65;
        cat_massive[6]=75;
        cat_massive[7]=56;
        cat_massive[8]=105;
        System.out.println("В данном элементе котского массива " +cat_massive[8]+" котов");
// усовершенствованная версия данного кода
        int cat_massive2[] ={12,17,24,43,35,65,75,56,105};
        System.out.println("\nВ данном элементе котского массива "+cat_massive2[8]+" котов");

    }
}
