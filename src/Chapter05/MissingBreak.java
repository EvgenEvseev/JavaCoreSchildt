package Chapter05;

public class MissingBreak {
    public static void main(String args[]){
        for(int i=0;i<12;i++)
            switch (i){
                case 0:
                    System.out.println("проверка принципа работы Break");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i меньше пяти");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i меньше десяти");
                    break;
                    default:
                        System.out.println("i равно или больше десяти");

            }
    }
}
