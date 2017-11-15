package Chapter20;
import java.io.*;
import java.io.ByteArrayInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) {
        String s = "If(a==4) a=0;\n";
        byte buf[] = s.getBytes();
        java.io.ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;

        try (PushbackInputStream f = new PushbackInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = f.read()) == '=') System.out.print(".eq.");
                        else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода вывода" + e);
        }
    }
}
