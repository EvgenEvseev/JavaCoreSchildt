package Chapter20;
import java.io.*;
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1= new File("C:/Users/Компрютер1/IdeaProjects/JavaCoreSchildt/COPYRIGHT.txt");
        p("Имя файла "+f1.getName());
        p("Путь "+f1.getPath());
        p("Абсолютли путь "+f1.getAbsolutePath());
        p("Родительский каталог "+f1.getParent());
        p(f1.exists()?"существует":"не существует");
        p(f1.isDirectory()?"является каталогом":"не является каталогом");
        p(f1.isFile()?"является обычным файлом":"может быть именованым каналом");
        p(f1.isAbsolute()?"является абсолютным":"не является абсолютным");
        p("Последнее изменение в файле: "+f1.lastModified());
        p("Размер "+f1.length()+" байт");
        System.out.println(f1.renameTo(new File("Nintendo")));
        System.out.println(f1.delete());
    }
}
