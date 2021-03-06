package Chapter10;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("В теле метода procA()");
            throw new RuntimeException("демонстрация");
        }finally {
            System.out.println("finally в метода ProcA");
        }
    }
    static void procB(){
        try{
            System.out.println("В теле метода procB()");
            return;
        }finally {
            System.out.println("finally в методе ProcB");
        }
    }
    static void procC(){
      try {
          System.out.println("В теле метода procC()");
      }finally {
          System.out.println("finally в методе procC");
      }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перезвачено");
        }
        procB();
        procC();
    }
}

