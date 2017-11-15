package Chapter20;

import java.io.*;

public class ByteArrayInputStream {
    public static void main(String[] args)throws IOException {
        String tmp="abcdefghijklmnopqrstuvwxyz";
        byte b[]=tmp.getBytes();
        java.io.ByteArrayInputStream input1=new java.io.ByteArrayInputStream(b);
        java.io.ByteArrayInputStream input2=new java.io.ByteArrayInputStream(b,0,3);

    }
}
