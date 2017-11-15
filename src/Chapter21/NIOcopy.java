package Chapter21;
import org.omg.IOP.IOR;

import java.nio.*;
import java.io.*;
import java.nio.channels.*;
import java.nio.file.*;
public class NIOcopy {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Применение - откуда и куда скопировать");
            return;
        }
        try{
            Path source =Paths.get(args[0]);
            Path target =Paths.get(args[1]);
            Files.copy(source,target,StandardCopyOption.REPLACE_EXISTING);
        }catch (InvalidPathException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
