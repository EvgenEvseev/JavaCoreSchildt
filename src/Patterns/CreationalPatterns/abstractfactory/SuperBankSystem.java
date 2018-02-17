package Patterns.CreationalPatterns.abstractfactory;

import Patterns.CreationalPatterns.abstractfactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Develop develop = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getPM();

        System.out.println("Creating banking system...");
        develop.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
