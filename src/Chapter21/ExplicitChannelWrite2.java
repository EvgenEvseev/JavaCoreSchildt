package Chapter21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class ExplicitChannelWrite2 {
    public static void main(String[] args) {
        FileOutputStream fOut=null;
        FileChannel fChan=null;
        ByteBuffer mBuf;
        try{
            fOut=new FileOutputStream("test.txt");
            fChan=fOut.getChannel();
            mBuf=ByteBuffer.allocate(26);
            for(int i=0;i<26;i++)mBuf.put((byte)('1'+i));
            mBuf.rewind();
            fChan.write(mBuf);
        }catch (IOException e){
            System.out.println(e);
        }
        try{
            if(fChan!=null)fChan.close();
        }catch (IOException e){
            System.out.println(e);
        }
        try{
            if(fOut!=null)fOut.close();
        }catch (IOException e){
            System.out.println(e);
        }




        int count;
        Path filepath= Paths.get("C:\\Users\\Компрютер1\\IdeaProjects\\JavaCoreSchildt\\test.txt");
        try(SeekableByteChannel fChannel= Files.newByteChannel(filepath)){
            ByteBuffer mBuff = ByteBuffer.allocate(128);
            do{
                count = fChannel.read(mBuff);
                if(count!=-1){
                    mBuff.rewind();
                    for(int i=0;i<count;i++) System.out.print((char)mBuff.get());
                }
            }while (count !=-1);
            System.out.println();
        }catch (IOException e){
            System.out.println("In-out error " +e);
        }
    }
}
