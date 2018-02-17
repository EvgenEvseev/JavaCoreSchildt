package Patterns.StructuralPatterns.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project= new Project();
        JuniorDeveloper juniorDeveloper=new JuniorDeveloper();
        SeniorDeveloper seniorDeveloper=new SeniorDeveloper();

        System.out.println("Junior in action...");
        project.beWritten(juniorDeveloper);

        System.out.println("\n======================================\n");

        System.out.println("Senior in action....");
        project.beWritten(seniorDeveloper);
    }
}
