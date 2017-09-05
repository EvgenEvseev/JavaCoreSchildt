package Practice01.TheGame;

 class Field {
    static String mass[] = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

     static void show() {
        System.out.println("|" + mass[0] + "|" + mass[1] + "|" + mass[2] + "|"+"выберите"+ "|" + "1" + "|" + "2" + "|" + "3" + "|");
        System.out.println("|" + mass[3] + "|" + mass[4] + "|" + mass[5] + "|"+"номер==>"+ "|" + "4" + "|" + "5" + "|" + "6" + "|");
        System.out.println("|" + mass[6] + "|" + mass[7] + "|" + mass[8] + "|"+"ячейки  "+ "|" + "7" + "|" + "8" + "|" + "9" + "|");
     }
     static void show2() {
         System.out.println("|" + mass[0] + "|" + mass[1] + "|" + mass[2] + "|");
         System.out.println("|" + mass[3] + "|" + mass[4] + "|" + mass[5] + "|");
         System.out.println("|" + mass[6] + "|" + mass[7] + "|" + mass[8] + "|");
    }
}
