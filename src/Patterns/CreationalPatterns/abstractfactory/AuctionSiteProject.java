package Patterns.CreationalPatterns.abstractfactory;


import Patterns.CreationalPatterns.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new WebsiteTeamFactory();
        Develop develop=projectTeamFactory.getDeveloper();
        Tester tester=projectTeamFactory.getTester();
        ProjectManager projectManager=projectTeamFactory.getPM();

        System.out.println("Creating auction website ");
        develop.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
