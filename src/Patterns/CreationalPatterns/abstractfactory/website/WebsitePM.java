package Patterns.CreationalPatterns.abstractfactory.website;

import Patterns.CreationalPatterns.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
