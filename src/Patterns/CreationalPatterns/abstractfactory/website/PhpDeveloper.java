package Patterns.CreationalPatterns.abstractfactory.website;

import Patterns.CreationalPatterns.abstractfactory.Develop;

public class PhpDeveloper implements Develop {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
