package Chapter20;
import java.io.*;
public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("C:\\Users\\Компрютер1\\IdeaProjects\\JavaCoreSchildt\\src\\Chapter20\\FileReaderDemo.java")){
            int c;
            while((c=fr.read())!=1) System.out.print((char)c);
        }catch (IOException e){
            System.out.println("Ошибка ввода вывода"+e);
        }
    }
}
