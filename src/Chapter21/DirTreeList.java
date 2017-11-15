package Chapter21;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class MyFileVisitor extends SimpleFileVisitor<Path>{
    public FileVisitResult visitFile (Path path,BasicFileAttributes attribs)throws IOException{
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
public class DirTreeList {
    public static void main(String[] args) {
        String Dirname="C:\\Users\\Компрютер1\\IdeaProjects\\JavaCoreSchildt\\MyDir";
        System.out.println("Catalogs tree, starts with catalog "+Dirname+":\n");
        try{
            Files.walkFileTree(Paths.get(Dirname),new MyFileVisitor());
        }catch (IOException exc){
            System.out.println(exc);
        }
    }
}
