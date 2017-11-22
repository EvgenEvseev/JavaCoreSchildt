package Practice03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TESTER {
    public static void main(String[] args) {
        Developer m=new Developer(1,"German","TeamLeader",150000);
        DeveloperDAO.safe(m);
        Developer m1=new Developer(2,"Moriarty","SeniorJava",130000);
        DeveloperDAO.safe(m1);
        Developer m2=new Developer(333,"Leon","BugKiller",120000);
        DeveloperDAO.safe(m2);

        Developer forremove =new Developer(43,"DeleteMen","SEO",5000);
        DeveloperDAO.safe(forremove);

        DeveloperDAO.remove(333);
        DeveloperDAO.remove(forremove);

        DeveloperDAO.getByID(2);
        DeveloperDAO.getAll();
    }
}
