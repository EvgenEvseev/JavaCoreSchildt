package Chapter21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class MappedChannelRead {
    public static void main(String[] args) {
        try(FileChannel fChan =(FileChannel)Files.newByteChannel(Paths.get("Test.txt"))){
            long fSize = fChan.size();

            MappedByteBuffer mBuf=fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);

            for(int i=0;i<fSize;i++) System.out.print((char)mBuf.get());
            System.out.println();
        }catch (InvalidPathException e){
            System.out.println("path error "+e);
        }catch (IOException e){
            System.out.println("in-out error "+e);
        }
    }
}
