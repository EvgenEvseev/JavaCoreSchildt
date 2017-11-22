package Practice03;


import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class DeveloperDAO {
    static void safe(Developer developer) {
        try (FileWriter wr = new FileWriter("C:\\DEV.txt", true)) {
            wr.write(developer.toString());
            wr.write("\r\n");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void remove(long ID) {
        ArrayList<String> AL = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\DEV.txt"))) {

            String line = null;
            while ((line = br.readLine()) != null) {
                if (Long.valueOf(line.split(",")[0]) != ID)
                    AL.add(line);
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\DEV.txt"))) {
                for (int n = 0; n < AL.size(); n++) {
                    bw.write(AL.get(n));
                    bw.write("\r\n");
                }
            }
        } catch (IOException e) {
        }
    }


    static void remove(Developer developer) {
        ArrayList<String> AL = new ArrayList<>();
        String dev = developer.toString();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\DEV.txt"))) {

            String line = null;
            while ((line = br.readLine()) != null) {
                if (!Objects.equals(line.split(",")[0], dev.split(",")[0]))
                    AL.add(line);
                System.out.println();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\DEV.txt"))) {
                for (int n = 0; n < AL.size(); n++) {
                    bw.write(AL.get(n));
                    bw.write("\r\n");
                }
            }
        } catch (IOException e) {
        }
    }


    static void getByID(long ID) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\DEV.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                if (Long.valueOf(line.split(",")[0]) == ID)
                    System.out.println(line);
            }
        } catch (IOException e) {
        }
    }

    static ArrayList<Developer> getAll() {
        ArrayList<Developer> AL = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\DEV.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                long ID = Long.valueOf(line.split(",")[0]);
                String name=line.split(",")[1];
                String prof=line.split(",")[2];
                String sal0=line.split(",")[3];
                int sal=Integer.valueOf(sal0.substring(1,sal0.length()-2));
                AL.add(new Developer (ID,name,prof,sal));
            }
            for(Developer n:AL)
                System.out.println(n);
        } catch (IOException e) {
        }
        return AL;
    }
}