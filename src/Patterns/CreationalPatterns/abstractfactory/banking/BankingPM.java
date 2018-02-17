package Patterns.CreationalPatterns.abstractfactory.banking;

import Patterns.CreationalPatterns.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project");
    }
}
