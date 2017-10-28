package Chapter10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne()");
        throw new IllegalAccessException("Строка");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("Перехвачено - "+e);
        }
    }
}