package Patterns.StructuralPatterns.strategy;

public class Sleeping implements Activity {
    @Override
    public void justDoIT() {
        System.out.println("Sleeping...");
    }
}
