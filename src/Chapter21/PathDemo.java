package Chapter21;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("C:\\Users\\Компрютер1\\IdeaProjects\\JavaCoreSchildt\\test.txt");
        System.out.println("File name "+filepath.getName(4));
        System.out.println("File path "+filepath);
        System.out.println("Absolute file path "+filepath.toAbsolutePath());
        System.out.println("Parent catalog "+filepath.getParent());
        if(Files.exists(filepath)) System.out.println("File is real");
        else System.out.println("File not real");

        try{
            if(Files.isHidden(filepath)) System.out.println("Assasin File");
            else System.out.println("All can see that file");
        }catch(IOException e){
            System.out.println(e);
        }

        if(Files.isWritable(filepath))
            System.out.println("File is possible to write in");
        if(Files.isReadable(filepath))
            System.out.println("File is possible to read");

        try{
            BasicFileAttributes attribs= Files.readAttributes(filepath,BasicFileAttributes.class);
                    if(attribs.isDirectory()) System.out.println("That is a catalog");
            else System.out.println("That is not catalog");
            if(attribs.isRegularFile()) System.out.println("That is a regular file");
            else System.out.println("That is not regular file");
            if(attribs.isSymbolicLink()) System.out.println("That is symbolic link");
            else System.out.println("That is not symbolic link");
            System.out.println("Last modification time is "+attribs.lastModifiedTime());
            System.out.println("Size of file is "+attribs.size()+" bytes");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
