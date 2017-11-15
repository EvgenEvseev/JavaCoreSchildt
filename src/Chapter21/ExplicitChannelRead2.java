package Chapter21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;
        try(SeekableByteChannel fChan=Files.newByteChannel(Paths.get("test.txt"))){
            ByteBuffer mBuf= ByteBuffer.allocate(128);
            do{
                count =fChan.read(mBuf);
                if(count!=-1){
                    mBuf.rewind();
                    for(int i=0;i<count;i++) System.out.print((char)mBuf.get());
                }
            }while(count!=-1);
            System.out.println();
        }catch (InvalidPathException e) {
            System.out.println("Path error " + e);
        }catch (IOException e){
            System.out.println("in-out error "+e);
        }
    }
}
