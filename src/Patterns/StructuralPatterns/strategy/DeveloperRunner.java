package Patterns.StructuralPatterns.strategy;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer dev = new Developer();

        dev.setActivity(new Sleeping());
        dev.executeActivity();

        dev.setActivity(new Training());
        dev.executeActivity();

        dev.setActivity(new Coding());
        dev.executeActivity();

        dev.setActivity(new Reading());
        dev.executeActivity();

        dev.setActivity(new Sleeping());
        dev.executeActivity();
    }
}
