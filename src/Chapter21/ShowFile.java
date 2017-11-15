package Chapter21;
import java.io.*;
import java.nio.file.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        if(args.length!=1){
            System.out.println("Применение ShowFile имя_файла");
            return;
        }
        try(InputStream fin= Files.newInputStream(Paths.get(args[0]))){
            do{
                i=fin.read();
                if(i!=-1) System.out.print((char)i);
            }while (i!=-1);
        }catch (InvalidPathException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
