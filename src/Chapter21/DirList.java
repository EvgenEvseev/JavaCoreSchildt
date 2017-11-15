package Chapter21;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class DirList {
    public static void main(String[] args) {
        String dirname="C:\\Users\\Компрютер1\\IdeaProjects\\JavaCoreSchildt";
        try(DirectoryStream<Path> dirstrim = Files.newDirectoryStream(Paths.get(dirname))){
            System.out.println("Catalog "+dirname);
            for(Path entry:dirstrim){
                BasicFileAttributes attribs= Files.readAttributes(entry,BasicFileAttributes.class);
                if(attribs.isDirectory()) System.out.print("<DIR>");
                else System.out.print("       ");
                System.out.println(entry.getName(4));
            }
        }catch (InvalidPathException e){
            System.out.println(e);
        }catch (NotDirectoryException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
