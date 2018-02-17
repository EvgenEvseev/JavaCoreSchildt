package Patterns.CreationalPatterns.abstractfactory.website;

import Patterns.CreationalPatterns.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
