package Patterns.StructuralPatterns.composite;

public class Project {
    public static void main(String[] args) {

        Team t = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        t.addDeveloper(firstJavaDeveloper);
        t.addDeveloper(secondJavaDeveloper);
        t.addDeveloper(cppDeveloper);

        t.createProject();
    }
}
