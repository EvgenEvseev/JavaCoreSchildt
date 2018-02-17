package Patterns.CreationalPatterns.abstractfactory.website;

import Patterns.CreationalPatterns.abstractfactory.Develop;
import Patterns.CreationalPatterns.abstractfactory.ProjectManager;
import Patterns.CreationalPatterns.abstractfactory.ProjectTeamFactory;
import Patterns.CreationalPatterns.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Develop getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new WebsitePM();
    }
}
