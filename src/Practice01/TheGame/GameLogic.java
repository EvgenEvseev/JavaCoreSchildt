package Practice01.TheGame;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    public void start (){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Добро пожаловать в игру крестики-нолики, для первого хода укажите ячейку с помощью клавиш 1-9");
        System.out.println("|" + "1" + "|" + "2" + "|" + "3" + "|");
        System.out.println("|" + "4" + "|" + "5" + "|" + "6" + "|");
        System.out.println("|" + "7" + "|" + "8" + "|" + "9" + "|");
        for (; ; ) {
            System.out.println("Ваш ход");
            int n = scan.nextInt() - 1;
            if (!Objects.equals(Field.mass[n], "x") & !Objects.equals(Field.mass[n], "o"))
                Field.mass[n] = "x";
            else {
                System.out.println("поле занято");
                continue;
            }
            Field.show();
            if (
                    ((Objects.equals(Field.mass[0], "x") & Objects.equals(Field.mass[1], "x")) & Objects.equals(Field.mass[2], "x")) ||
                            ((Objects.equals(Field.mass[3], "x") & Objects.equals(Field.mass[4], "x")) & Objects.equals(Field.mass[5], "x")) ||
                            ((Objects.equals(Field.mass[6], "x") & Objects.equals(Field.mass[7], "x")) & Objects.equals(Field.mass[8], "x")) ||
                            ((Objects.equals(Field.mass[0], "x") & Objects.equals(Field.mass[3], "x")) & Objects.equals(Field.mass[6], "x")) ||
                            ((Objects.equals(Field.mass[1], "x") & Objects.equals(Field.mass[4], "x")) & Objects.equals(Field.mass[7], "x")) ||
                            ((Objects.equals(Field.mass[2], "x") & Objects.equals(Field.mass[5], "x")) & Objects.equals(Field.mass[8], "x")) ||
                            ((Objects.equals(Field.mass[2], "x") & Objects.equals(Field.mass[4], "x")) & Objects.equals(Field.mass[6], "x")) ||
                            ((Objects.equals(Field.mass[0], "x") & Objects.equals(Field.mass[4], "x")) & Objects.equals(Field.mass[8], "x"))) {
                System.out.println("Победа Игрока!");
                break;
            }
            if ((Objects.equals(Field.mass[0], "x") ^ Objects.equals(Field.mass[0], "o")) & (Objects.equals(Field.mass[1], "x") ^ Objects.equals(Field.mass[1], "o")) &
                    (Objects.equals(Field.mass[2], "x") ^ Objects.equals(Field.mass[2], "o")) & (Objects.equals(Field.mass[3], "x") ^ Objects.equals(Field.mass[3], "o")) &
                    (Objects.equals(Field.mass[4], "x") ^ Objects.equals(Field.mass[4], "o")) & (Objects.equals(Field.mass[5], "x") ^ Objects.equals(Field.mass[5], "o")) &
                    (Objects.equals(Field.mass[6], "x") ^ Objects.equals(Field.mass[6], "o")) & (Objects.equals(Field.mass[7], "x") ^ Objects.equals(Field.mass[7], "o")) &
                    (Objects.equals(Field.mass[8], "x") ^ Objects.equals(Field.mass[8], "o"))) {
                System.out.println("Ничья!");
                break;
            }

            System.out.println("Ход ИИ");

            for(;;){int ran = rand.nextInt(9);
                if (!Objects.equals(Field.mass[ran], "x") & !Objects.equals(Field.mass[ran], "o")){
                    Field.mass[ran] = "o";
                    break;
                }
                else continue;}

            Field.show2();
            if (
                    ((Objects.equals(Field.mass[0], "o") & Objects.equals(Field.mass[1], "o")) & Objects.equals(Field.mass[2], "o")) ||
                            ((Objects.equals(Field.mass[3], "o") & Objects.equals(Field.mass[4], "o")) & Objects.equals(Field.mass[5], "o")) ||
                            ((Objects.equals(Field.mass[6], "o") & Objects.equals(Field.mass[7], "o")) & Objects.equals(Field.mass[8], "o")) ||
                            ((Objects.equals(Field.mass[0], "o") & Objects.equals(Field.mass[3], "o")) & Objects.equals(Field.mass[6], "o")) ||
                            ((Objects.equals(Field.mass[1], "o") & Objects.equals(Field.mass[4], "o")) & Objects.equals(Field.mass[7], "o")) ||
                            ((Objects.equals(Field.mass[2], "o") & Objects.equals(Field.mass[5], "o")) & Objects.equals(Field.mass[8], "o")) ||
                            ((Objects.equals(Field.mass[2], "o") & Objects.equals(Field.mass[4], "o")) & Objects.equals(Field.mass[6], "o")) ||
                            ((Objects.equals(Field.mass[0], "o") & Objects.equals(Field.mass[4], "o")) & Objects.equals(Field.mass[8], "o"))) {
                System.out.println("Победа ИИ!");
                break;
            }
        }
    }
}
