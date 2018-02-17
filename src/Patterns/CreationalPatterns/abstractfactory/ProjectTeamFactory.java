package Patterns.CreationalPatterns.abstractfactory;

public interface ProjectTeamFactory {
    Develop getDeveloper();
    Tester getTester();
    ProjectManager getPM();
}
