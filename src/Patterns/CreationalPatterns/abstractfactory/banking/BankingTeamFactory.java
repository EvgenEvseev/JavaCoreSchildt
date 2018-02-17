package Patterns.CreationalPatterns.abstractfactory.banking;

import Patterns.CreationalPatterns.abstractfactory.Develop;
import Patterns.CreationalPatterns.abstractfactory.ProjectManager;
import Patterns.CreationalPatterns.abstractfactory.ProjectTeamFactory;
import Patterns.CreationalPatterns.abstractfactory.Tester;


public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Develop getDeveloper() {
        return new JavaDevelop();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingPM();
    }
}
