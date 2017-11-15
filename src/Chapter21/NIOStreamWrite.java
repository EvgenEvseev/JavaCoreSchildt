package Chapter21;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){
            for(int i=0;i<26;i++)fout.write((byte)('A'+i));
        }catch (InvalidPathException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
